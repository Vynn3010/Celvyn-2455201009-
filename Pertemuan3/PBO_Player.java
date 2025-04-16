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
public class PBO_Player {
   public static void main(String[] args) {
        // PLAYER PENYERANG
        PBO_MasterPlayer kuli = new PBO_MasterPlayer();
        kuli.nama = "Bambang Santoso";
        kuli.speed = 200;
        kuli.attack = 10;
        kuli.healthPoint = 100;
        
        // PLAYER YANG DISERANG
        PBO_MasterPlayer petani = new PBO_MasterPlayer();
        petani.nama = "Jaya";
        petani.speed = 200;
        petani.healthPoint = 100; 
        
        kuli.runPlayer();
        System.out.println("Serang ");
        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
        
       
        // serang lagi
        System.out.println("Serang lagi");
        kuli.attack = 50;
        kuli.healthPoint = 100;
        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
        
        // serang lagi
        System.out.println("Serang ultimatum");
        kuli.attack = 100;
        kuli.healthPoint = 100;
        petani.healthPoint = kuli.serangLawan(kuli.attack, petani.healthPoint);
        
        if(kuli.isDead()){
            System.out.println("Babbang menang : Game Over");
        }
    }
    
}