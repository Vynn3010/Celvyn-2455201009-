package Pertemuan2;

public class PerulanganWHILE {

    // 3. Perulangan WHILE
    public static void perulangan() {
        System.out.println("<<=== Looping WHILE ===>>");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }
        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        perulangan();
    }
}
