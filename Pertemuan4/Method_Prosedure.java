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
class Method_Prosedure {
    public static void main(String[] args) {
        Method_Prosedure rata_rata = new Method_Prosedure();
        rata_rata.rata_rata();
    }
    
    // prosedure meng hitutung rata rata
    public void rata_rata (){
        int ipa = 90;
        int pkn = 85;
        int ips = 80;
        
        int[] semua_nilai = {ipa, pkn, ips};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumblah += semua_nilai[i];
        }
        rata2 = jumblah/semua_nilai.length;
        System.out.println("Rata Rata Nilai = " + rata2);
    } 
}
