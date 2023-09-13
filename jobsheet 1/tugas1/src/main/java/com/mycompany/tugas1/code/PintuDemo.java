/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class PintuDemo {
    public static void main(String[] args) {
        Pintu krs1 = new Pintu();
        PintuElect krs2 = new PintuElect();
        
        krs1.setMerek("IKEA");
        krs1.setHarga(70000);
        krs1.setWarna("Hitam");
        krs1.setTinggi(8);
        krs1.cekLemari();
        System.out.println("--------------------");
        krs2.setMerek("Chairman");
        krs2.setHarga(300000);
        krs2.setWarna("Merah");
        krs2.setTinggi(8);
        krs2.Open("BUKA");
        krs2.cekLemari();
    }
}
