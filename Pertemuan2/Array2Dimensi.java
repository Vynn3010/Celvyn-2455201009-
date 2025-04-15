package Pertemuan2;

public class Array2Dimensi {
    // 4. Array Dua Dimensi
    // Method utama
    public static void main(String[] args) {
          System.out.println("\n<<=== Array 2 Dimensi ===>>");
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
       
    }
}