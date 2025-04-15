package Pertemuan2;

public class Array {

    // 4. Array Satu Dimensi
    public static void arrayContoh() {
        System.out.println("<<=== Array 1 Dimensi ===>>");
        int[] angka = {1, 2, 3, 4, 5};
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }
            }
            
    // Method utama
    public static void main(String[] args) {
        arrayContoh();
    }
}
