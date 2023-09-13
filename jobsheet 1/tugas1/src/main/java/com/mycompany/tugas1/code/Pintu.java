/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class Pintu {
    private String merek;
    private String warna;
    private int harga;
    public int tinggi;
    
    public void setMerek(String newMerek){
        merek = newMerek;
    }
    public void setWarna(String newWarna){
        warna = newWarna;
    }
    public void setHarga(int newHarga){
        harga = newHarga;
    }
    public void setTinggi(int newTinggi){
        tinggi = newTinggi;
    }
    public void cekLemari(){
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Harga : " + harga);
        System.out.println("Tinggi : " + tinggi);
    }
}
