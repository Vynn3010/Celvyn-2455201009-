/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author calvi
 */
public class Method_Fungsi {
    public static void main(String[] args) {
    Method_Fungsi rata_rata = new Method_Fungsi();
    double nilai = rata_rata.rata_rata();
        System.out.println("Rata Rata Niai dari fungsi = " + nilai);
    }
    
    //fungsi untuk menghitung nilai rata-rata
   public double rata_rata(){   
        int ipa = 90;
        int pkn = 85;
        int ips = 80;
        
        int[] semua_nilai = {ipa, pkn, ips};
        double jumlah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata2 = jumlah/semua_nilai.length;
        return rata2;
    }
    
    }