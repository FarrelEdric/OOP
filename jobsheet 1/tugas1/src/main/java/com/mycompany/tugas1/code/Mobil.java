/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class Mobil {
    private String merk;
    private String warna;
    private String tahun;
    public int kecepatan;
    
    public void setMerek(String newMerek){
        merk = newMerek;
    }
    public void setWarna(String newWarna){
        warna = newWarna;
    }
    public void setTahun(String newtahun){
        tahun = newtahun;
    }
    public void kecepatan(int newKecepatan){
        kecepatan += newKecepatan;
    }
    public void cekmobil(){
        System.out.println("Merek Mobil : " + merk);
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Tahun produksi mobil : " + tahun);
        System.out.println("Kecepatan mobil : " + kecepatan);
    }
}
