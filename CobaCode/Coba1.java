import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Coba1 extends JPanel implements ActionListener, KeyListener {
    private final int TILE_SIZE = 20;
    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    private final int ALL_TILES = (WIDTH * HEIGHT) / (TILE_SIZE * TILE_SIZE);
    private final ArrayList<Point> snake = new ArrayList<>();
    private Point food;
    private int dx = 1, dy = 0; // arah gerakan (kanan)
    private boolean running = true;
    private javax.swing.Timer timer;
    private Random rand = new Random();

    public Coba1() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        initGame();
    }

    private void initGame() {
        snake.clear();
        snake.add(new Point(5, 5)); // posisi awal ular
        placeFood();
        timer = new javax.swing.Timer(150, this);
        timer.start();
    }

    private void placeFood() {
        int x, y;
        do {
            x = rand.nextInt(WIDTH / TILE_SIZE);
            y = rand.nextInt(HEIGHT / TILE_SIZE);
            food = new Point(x, y);
        } while (snake.contains(food));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            repaint();
        }
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head.x + dx, head.y + dy);

        // Tambah kepala baru
        snake.add(0, newHead);

        // Jika makan umpan
        if (newHead.equals(food)) {
            placeFood();
        } else {
            // Hapus ekor jika tidak makan
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);
        // Tabrak dinding
        if (head.x < 0 || head.y < 0 || head.x >= WIDTH / TILE_SIZE || head.y >= HEIGHT / TILE_SIZE) {
            running = false;
            timer.stop();
        }

        // Tabrak tubuh sendiri
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                timer.stop();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar umpan
        g.setColor(Color.RED);
        g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Gambar ular
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        // Game over
        if (!running) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("GAME OVER", WIDTH / 2 - 110, HEIGHT / 2);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        // Tidak boleh berbalik arah langsung
        if (key == KeyEvent.VK_LEFT && dx != 1) {
            dx = -1;
            dy = 0;
        } else if (key == KeyEvent.VK_RIGHT && dx != -1) {
            dx = 1;
            dy = 0;
        } else if (key == KeyEvent.VK_UP && dy != 1) {
            dx = 0;
            dy = -1;
        } else if (key == KeyEvent.VK_DOWN && dy != -1) {
            dx = 0;
            dy = 1;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake Game - Coba1");
            Coba1 game = new Coba1();
            frame.add(game);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
