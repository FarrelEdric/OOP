/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class AC {
    static String warna;
    static int harga;
    static int suhu;
    static int t, k;
    
    static void setWarna(String newWarna){
        warna = newWarna;
    }
    static void setHarga(int newHarga){
        harga = newHarga;
    }
    static void tambahSuhu(int newSuhu){
        t = newSuhu;
        suhu += newSuhu;
        if(t==1){
        System.out.println("Suhu bertambah " + newSuhu + " Celcius");
        }
    }
    static void kurangSuhu(int newSuhu){
        k = newSuhu;
        suhu -= newSuhu;
        if(k==1){
        System.out.println("Suhu berkurang " + newSuhu + " Celcius");
        }
    }
    static void cetakAC(){
        System.out.println("Warna : " + warna);
        System.out.println("Harga : " + harga);
        if(t!=0){
        System.out.println("Suhu bertambah " + t + " Celcius");
        }
        if(k!=0){
        System.out.println("Suhu berkurang " +  k + " Celcius");
        }
        System.out.println("Suhu : " + suhu);
    } 
    public static void main(String[] args) {
        setWarna("Hitam");
        setHarga(700000);
        tambahSuhu(16);
        kurangSuhu(2);
        cetakAC();
    }
}
