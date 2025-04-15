package Pertemuan2;

public class Deklarasivariabel {

    // 1. Deklarasi Variabel
    public static void deklarasiVariabel() {
        int angka = 10;
        double pecahan = 3.14;
        char karakter = 'A';
        boolean status = true;
        String teks = "Celvyn Revaldo";

        System.out.println("<<=== Deklarasi Variabel ===>>");
        System.out.println("Integer: " + angka);
        System.out.println("Double: " + pecahan);
        System.out.println("Char: " + karakter);
        System.out.println("Boolean: " + status);
        System.out.println("String: " + teks);
        System.out.println();
    }
 // Method utama
    public static void main(String[] args) {
        deklarasiVariabel ();
    }
}