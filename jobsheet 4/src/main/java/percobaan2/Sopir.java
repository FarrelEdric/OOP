/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2;

/**
 *
 * @author Farrel Edric
 */
   public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    
    public int hitungBiayaSopir(int hari){
    return biaya * hari;
    } 
}

