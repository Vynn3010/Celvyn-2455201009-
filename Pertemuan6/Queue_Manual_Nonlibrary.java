/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author calvi
 */
public class Queue_Manual_Nonlibrary {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Konstruktor
    public Queue_Manual_Nonlibrary(int size) {
        queue = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Menambahkan data ke antrian
    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan: " + data);
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        count++;
        System.out.println(data + " berhasil masuk antrian.");
    }

    // Menghapus data dari antrian
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dilayani.");
            return;
        }

        String removed = queue[front];
        front = (front + 1) % capacity;
        count--;
        System.out.println(removed + " telah dilayani dan keluar dari antrian.");
    }

    // Menampilkan isi antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.print("Antrian saat ini: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return count == 0;
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return count == capacity;
    }

    // Method utama
    public static void main(String[] args) {
        Queue_Manual_Nonlibrary antrian = new Queue_Manual_Nonlibrary(5);

        antrian.enqueue("Dandy");
        antrian.enqueue("Husna");
        antrian.enqueue("Rani");

        antrian.tampilkanAntrian();

        antrian.dequeue();
        antrian.tampilkanAntrian();

        antrian.enqueue("Ilham");
        antrian.enqueue("Radit");
        antrian.enqueue("Syihab"); // akan gagal karena antrian penuh

        antrian.tampilkanAntrian();
    }
}

