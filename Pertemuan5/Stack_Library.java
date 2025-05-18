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

public class Stack_Library {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elemen ke stack
        stack.push(10);
        System.out.println("Pushed: 10");
        stack.push(20);
        System.out.println("Pushed: 20");
        stack.push(30);
        System.out.println("Pushed: 30");

        // Lihat elemen paling atas
        System.out.println("Top item: " + stack.peek());

        // Pop elemen dari stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Coba pop dari stack kosong
        if (stack.isEmpty()) {
            System.out.println("Stack kosong. Tidak dapat pop.");
        } else {
            System.out.println("Popped: " + stack.pop());
        }
    }
}