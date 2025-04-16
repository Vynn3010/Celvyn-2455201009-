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
public class PBO_MasterPlayer {
    String nama;
    int speed;
    int attack;
    int healthPoint;

    // Method untuk menjalankan player
    public void runPlayer() {
        System.out.println(nama + " is running at speed " + speed + " km/h");
    }

    // Method untuk menyerang lawan
    public int serangLawan(int attack, int healthPoint) {
        healthPoint -= attack;
        System.out.println(nama + " menyerang dengan attack " + attack + " dan sisa HP lawan: " + healthPoint);
        return healthPoint;
    }

    // Method untuk cek apakah player mati
    public boolean isDead() {
        return healthPoint <= 0;
    }
}