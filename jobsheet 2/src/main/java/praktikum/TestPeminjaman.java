/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */
public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = 
                new Peminjaman(1, "John", "Game A", 7, 50.0);
        Peminjaman peminjaman2 = 
                new Peminjaman(2, "Alice", "Game B", 5, 60.0);

        System.out.println("Data Peminjaman 1:");
        peminjaman1.tampilData();

        System.out.println("\nData Peminjaman 2:");
        peminjaman2.tampilData();
    }
}