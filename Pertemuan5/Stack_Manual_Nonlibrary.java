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
public class Stack_Manual_Nonlibrary {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public Stack_Manual_Nonlibrary(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push item ke stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack penuh. Tidak dapat push.");
        }
    }

    // Pop item dari stack
    public int pop() {
        if (!isEmpty()) {
            int value = stackArray[top--];
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack kosong. Tidak dapat pop.");
            return -1;
        }
    }

    // Lihat item teratas
    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack kosong. Tidak ada elemen.");
            return -1;
        }
    }

    // Cek apakah stack kosong
    public boolean isEmpty() {
        return (top == -1);
    }

    // Main method untuk testing
    public static void main(String[] args) {
        Stack_Manual_Nonlibrary stack = new Stack_Manual_Nonlibrary(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top item: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // coba pop saat stack kosong
    }
}
