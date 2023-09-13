/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */
public class Lingkaran {
    double phi =3.14;
    double r;
    public double hitungLuas(double r ){
        this.r = r;
        return phi*r*r;
    }
    public double hitungKeliling(double r ){
        this.r = r;
        return phi*2*r;
    }
}
