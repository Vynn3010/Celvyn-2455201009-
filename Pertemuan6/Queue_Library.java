/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author calvi
 */
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Library {

    // Objek queue untuk antrian peminjam
    private Queue<String> antrianPeminjam;

    public Queue_Library() {
        antrianPeminjam = new LinkedList<>();
    }

    // Method untuk menambahkan peminjam ke antrian
    public void tambahPeminjam(String nama) {
        antrianPeminjam.add(nama);
        System.out.println(nama + " telah masuk ke dalam antrian peminjaman.");
    }

    // Method untuk melayani peminjam (mengeluarkan dari antrian)
    public void layaniPeminjam() {
        if (!antrianPeminjam.isEmpty()) {
            String nama = antrianPeminjam.poll();
            System.out.println(nama + " sedang dilayani untuk peminjaman buku.");
        } else {
            System.out.println("Tidak ada peminjam dalam antrian.");
        }
    }

    // Method untuk menampilkan antrian saat ini
    public void tampilkanAntrian() {
        System.out.println("Antrian saat ini: " + antrianPeminjam);
    }

    public static void main(String[] args) {
        Queue_Library perpustakaan = new Queue_Library();

        perpustakaan.tambahPeminjam("Dandy");
        perpustakaan.tambahPeminjam("Husna");
        perpustakaan.tambahPeminjam("Labib");

        perpustakaan.tampilkanAntrian();

        perpustakaan.layaniPeminjam();
        perpustakaan.tampilkanAntrian();

        perpustakaan.layaniPeminjam();
        perpustakaan.layaniPeminjam();
        perpustakaan.layaniPeminjam();  // menguji jika antrian kosong
    }
}

