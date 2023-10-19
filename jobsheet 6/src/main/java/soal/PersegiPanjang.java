/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal;

/**
 *
 * @author Farrel Edric
 */
public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas() {
        return panjang * lebar;
    }

    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
