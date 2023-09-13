/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */
 
public class Peminjaman {
    private int id;
    private String namaMember;
    private String namaGame;
    private int lamaPinjam;
    private double harga;

    public Peminjaman(int id, String namaMember, String namaGame, int lamaPinjam, double harga) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaPinjam = lamaPinjam;
        this.harga = harga;
    }

    public double hitungHargaTotal() {
        return lamaPinjam * harga;
    }

    public void tampilData() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
        System.out.println("Harga Total: Rp " + hitungHargaTotal());
    }
}


