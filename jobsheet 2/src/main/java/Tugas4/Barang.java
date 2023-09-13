/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Farrel Edric
 */
public class Barang {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;

    // Konstruktor
    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    // Method untuk menghitung harga jual
    public int hitungHargaJual() {
        float diskonDecimal = diskon / 100; // Mengubah diskon dari persen ke desimal
        int hargaJual = (int) (hargaDasar - (diskonDecimal * hargaDasar));
        return hargaJual;
    }

    // Method untuk menampilkan data barang
    public void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }
}