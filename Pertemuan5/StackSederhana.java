/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author calvi
 */
public class StackSederhana {
    static String[] tumpukanData; // Array untuk menyimpan elemen stack
    static int kapasitas;         // Kapasitas maksimal stack
    static int posisiTeratas;     // Indeks atas dari stack
    
    // Mengaturkapasitas stack
    void aturKapasitas (int ukuran) {
        kapasitas = ukuran;
        tumpukanData = new String[kapasitas];
        posisiTeratas = 0;
    }
    
    // Cek apakah stack kosong
    boolean kosong(){
        return posisiTeratas == 0;
    }
    
    //Cek apakah stack penuh
    boolean penuh () {
        return posisiTeratas == kapasitas;
    }
    
    // Menambahkan item kedalam stack
    void tambahItem (String item) {
        if (penuh ()) {
            System.out.println("Tumpukan sudah penuh. Tidak bisa menabahkan \"" + item + "\".");
        } else {
            tumpukanData [posisiTeratas++] = item;
            System.out.println("Item \"" + item + "\" berhasil ditambahkan ketumpukan.");
        }
    }
    
    // Menampilkan item paling atas dari stack
    void lihatTeratas() {
        if (kosong ()) {
            System.out.println("Tumpukan kosong. Tidak ada item yang bisa dilihat.");
        } else {
            System.out.println("Item paling atas adalah: \"" + tumpukanData[posisiTeratas - 1] + "\"");
        }
    }
        
    // Menari item dalam stack
    void cariItem (String item) {
        boolean ditemukan = false;
        int i = 0;
        while (i < posisiTeratas) {
            if (item.equals(tumpukanData[i])) {
                ditemukan = true;
                break;
            }
            i++;
        }
        
        if (ditemukan) {
            System.out.println("Item \"" + item + "\" ditemukan pada posisi ke-" + (i + 1));
        } else {
            System.out.println("Item \"" + item + "\" tidak ditemukan dalam tumpukan.");
        }   
    }
    
    // Menampilkan semua isi stack
    void tampilkanSemua() {
        System.out.println("=== Isi Tumpukan Saat Ini ===");
        for (int i = posisiTeratas - 1; i >= 0; i--) {
            System.out.println("Posisi ke-" + (1 + i) + " : " + tumpukanData[i]);
        }
        System.out.println("==============================");
    }
    
    public static void main (String[] args) {
        StackSederhana alatTulisStack = new StackSederhana();
        alatTulisStack.aturKapasitas(6);
        alatTulisStack.tambahItem("Pulpen");
        alatTulisStack.tambahItem("Pensil");
        alatTulisStack.tambahItem("Penghapus");
        alatTulisStack.tambahItem("Penggaris");
        alatTulisStack.tambahItem("Spidol");
        alatTulisStack.tambahItem("Tipe-X");
        alatTulisStack.lihatTeratas();
        alatTulisStack.tampilkanSemua();
        alatTulisStack.cariItem("Spidol");
        alatTulisStack.cariItem("Stabilo");
    }
}