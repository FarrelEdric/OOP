/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;
/**
 *
 * @author Farrel Edric
 */
public class TestBarang {
    public static void main(String[] args) {
        // Membuat objek barang
        Barang barang1 = new Barang("001", "Laptop", 7000000, 10);
        Barang barang2 = new Barang("002", "Smartphone", 3500000, 5);

        // Menampilkan data barang
        System.out.println("Data Barang 1:");
        barang1.tampilData();

        System.out.println("\nData Barang 2:");
        barang2.tampilData();
    }
}
