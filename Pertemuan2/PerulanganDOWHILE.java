package Pertemuan2;

public class PerulanganDOWHILE {

    // 3. Perulangan DO WHILE
    public static void perulangan() {
        System.out.println("<<=== Looping DO WHILE ===>>");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        perulangan();
    }
}
