/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sepedademo;

/**
 *
 * @author Farrel Edric
 */
public class Sepeda {

    private String merek; 
    private int kecepatan;   
    private int gear;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void gantiGear (int newValue) {
        gear = newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void rem(int decrement){
        kecepatan = kecepatan - decrement;
}
    public void cetakStatus(){
        System.out.println("Merek    :" + merek);
        System.out.println("kecepatan:" + kecepatan);
        System.out.println("Gear     :" + gear);
    }
}