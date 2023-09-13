/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class MobilDemo {
    public static void main(String[] args) {
        Mobil mbl1 = new Mobil();
        MobilSport mbl2 = new MobilSport();
        
        mbl1.setMerek("Honda");
        mbl1.setWarna("Hitam");
        mbl1.setTahun("2013");
        mbl1.kecepatan(10);
        mbl1.cekmobil();
        System.out.println("-----------------------");
        mbl2.setMerek("Mitsubishi");
        mbl2.setWarna("Putih");
        mbl2.setTahun("2022");
        mbl2.kecepatan(20);
        mbl2.nitro(2);
        mbl2.cekmobil();
    }
}
