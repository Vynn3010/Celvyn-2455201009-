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
public class PBO_MasterMobil {
    String karakteristik = "";
    String merk = "";
    String tahunPembuatan = "";
    
    void berjalan(String cepat){
        if(cepat == "normal"){
            System.out.println("Mobil sedang berjaan 25KM/JAM");
        }
        if(cepat == "lambat"){
            System.out.println("Mobil sedang berjaan 15KM/JAM");
        }
        if(cepat == "cepat"){
            System.out.println("Mobil sedang berjaan 150KM/JA<");
        }
    }
     void berhenti(){
        System.out.println("Mobil berhenti");
    }
}