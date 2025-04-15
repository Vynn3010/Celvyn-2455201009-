package Pertemuan2;

public class PercabanganIF {

    // 2. Percabangan IF ELSE dan SWITCH CASE
    public static void percabangan() {
        int nilai = 58;
        System.out.println("<<=== Percabangan ===>>");

        // IF ELSE
        if (nilai >= 100) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else if (nilai >= 50) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai E atau di bawahnya");
        }

        
        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        percabangan();
    }
}
