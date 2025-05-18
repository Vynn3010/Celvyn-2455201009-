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
import java.util.Stack;

public class Stack_Studi_Kasus {

    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();

        // Simulasi mengetik teks
        String currentText = "";
        System.out.println("Mengetik teks...");

        // Tindakan mengetik
        currentText += "Hal";
        undoStack.push(currentText); // Simpan versi 1
        System.out.println("Teks saat ini: " + currentText);

        currentText += "o";
        undoStack.push(currentText); // Simpan versi 2
        System.out.println("Teks saat ini: " + currentText);

        currentText += "!";
        undoStack.push(currentText); // Simpan versi 3
        System.out.println("Teks saat ini: " + currentText);

        // Simulasi undo
        System.out.println("\nMelakukan undo 1x...");
        undoStack.pop(); // Hapus versi terakhir
        currentText = undoStack.peek(); // Ambil versi sebelumnya
        System.out.println("Teks setelah undo: " + currentText);

        System.out.println("\nMelakukan undo 2x...");
        undoStack.pop();
        currentText = undoStack.peek();
        System.out.println("Teks setelah undo: " + currentText);
    }
}