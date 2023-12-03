/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package kuis2;

/**
 *
 * @author Farrel Edric
 */
public class Mahasiswa {
    // Atribut.
    String nama;
    String nim;
    double nilai;

    // Konstruktor.
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai; 
    }

    // Fungsi menghitung IPK tanpa parameter.
    public double hitung_ipk() {
        return nilai / 100;
    }

    // Overload fungsi hitung_ipk dengan parameter nilai_sks.
    public double hitung_ipk(int nilai_sks) {
        // Logika perhitungan IPK dengan bobot nilai_sks.
        return (nilai * nilai_sks) / (100*nilai_sks);
    }
}

