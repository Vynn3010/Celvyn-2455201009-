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
public class Method_Prosedure_Parameter {
    public static void main(String[] args) {
        Method_Prosedure_Parameter mahasiswa = new Method_Prosedure_Parameter();
        mahasiswa.simpan_nilai("Dandy", 95, 90, 100);
        mahasiswa.simpan_nilai("Husna", 90, 100, 90);
        mahasiswa.simpan_nilai("Labib", 60, 80, 100);
    }
    
    public void simpan_nilai(String nama, int ipa, int pkn, int ips){
        int[] kumpulan_nilai = {ipa, pkn, ips};
        String[] matkul = {"IPA ", "PKN ", "IPS "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
}
