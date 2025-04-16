/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author calvi
 */
public class PBO_Mobil {
    public static void main(String[] args) {
        PBO_MasterMobil Xenia = new PBO_MasterMobil();
        Xenia.karakteristik = "Irit, Keluarga Nyaman";
        Xenia.merk = "Daihatsu";
        Xenia.tahunPembuatan = "2022";
        
        System.out.println("1. Xenia");
        System.out.println("Karateristik : " + Xenia.karakteristik);
        System.out.println("Merek        : " + Xenia.merk);
        System.out.println("Keluaran     : " + Xenia.tahunPembuatan);
        
        Xenia.berjalan("lambat");
        Xenia.berjalan("normal");
        Xenia.berjalan("cepat");
        Xenia.berhenti();
        
        PBO_MasterMobil Mazda3 = new PBO_MasterMobil();
        Mazda3.karakteristik = "Sporty, Irit Bensin, Desain Elegan";
        Mazda3.merk = "Mazda";
        Mazda3.tahunPembuatan = "2022";
        
        System.out.println("\n2. Mazda 3");
        System.out.println("Karateristik : " + Mazda3.karakteristik);
        System.out.println("Merek        : " + Mazda3.merk);
        System.out.println("Keluaran     : " + Mazda3.tahunPembuatan);
        
        Mazda3.berjalan("lambat");
        Mazda3.berjalan("normal");
        Mazda3.berjalan("cepat");
        Mazda3.berhenti();
        
        System.out.println("\n1. Xenia");
        System.out.println("Karateristik : " + Xenia.karakteristik);
        System.out.println("Merek        : " + Xenia.merk);
        System.out.println("Keluaran     : " + Xenia.tahunPembuatan);
    }
}
