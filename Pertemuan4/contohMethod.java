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
public class contohMethod {
    public static void main(String[] args) {
      
        contohMethod contoh = new contohMethod();
        contoh.luasLingkaranProsedur();
        contoh.luasLingkaranFungsi();
    }
   //Cara pertama membuat Method
   //Method Prosedur
   //Ditandai dengan Void
   public void luasLingkaranProsedur() {
       double jari2 = 10;
       double phi = 3.14;
       double luas = phi*jari2*jari2;
       System.out.println("Luas lingkaran pakai method Prosedur = " + luas);
   }
   
   //Cara Kedua
   //Membuat Method Dengan Fungsi
   //Ditandai dengan nilai balik "return" dan diawali dengan tipe data
   
   double luasLingkaranFungsi() {
       float jari2 = 10;
       float phi = (float) 3.14;
       float luas = phi*jari2*jari2;
       
       System.out.println("Luas lingkaran pakai method Fungsi = " + luas);
       return luas;
}
}