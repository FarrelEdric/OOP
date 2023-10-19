/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal;

/**
 *
 * @author Farrel Edric
 */
public class Lingkaran extends BangunDatar{
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return (float) (3.14 * r * r);
    }

    public float keliling() {
        return (float) (2 * 3.14 * r);
    }
}
