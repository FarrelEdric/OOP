/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class MobilSport extends Mobil {
    private int nitro;
    
    public void nitro(int nitro){
        kecepatan += (nitro * 5); 
    }
    public void cekMobil(){
        super.cekmobil();
        System.out.println("Nitro : " + nitro);
    }
}
