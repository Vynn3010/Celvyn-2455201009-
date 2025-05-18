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
import java.util.Scanner;

public class Queue_Study_Kasus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> antrian = new LinkedList<>();

        int pilihan;
        do {
            System.out.println("\n|=== Sistem Antrian Pelayanan ===");
            System.out.println("|1. Tambah Antrian");
            System.out.println("|2. Panggil Antrian");
            System.out.println("|3. Lihat Antrian");
            System.out.println("|4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    antrian.add(nama);
                    System.out.println("Pelanggan '" + nama + "' ditambahkan ke antrian.");
                    break;
                case 2:
                    if (!antrian.isEmpty()) {
                        String pelanggan = antrian.poll();
                        System.out.println("Memanggil pelanggan: " + pelanggan);
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 3:
                    System.out.println("Daftar Antrian: " + antrian);
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}