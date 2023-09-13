/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class Televisi {
    static String merek;
    static String power;
    static int harga;
    static String channel;
    
    static void setMerek(String newMerek){
    merek = newMerek;
    }
    static void setPower(String newPower){
    power = newPower;
    }
    static void setHarga(int newHarga){
    harga = newHarga;
    }
    static void setChannel(String newChannel){
    channel = newChannel;
    }
    static void cetakTv(){
        System.out.println("Merek : " + merek);
        System.out.println("Power : " + power);
        System.out.println("Harga : " + harga);
        System.out.println("Channel : " + channel);
    }
    
    public static void main(String[] args) {
        setMerek("LG");
        setPower("ON");
        setHarga(2000000);
        setChannel("RCTI");
        cetakTv();
    }
}
