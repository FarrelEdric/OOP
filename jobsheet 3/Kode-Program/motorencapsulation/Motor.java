/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author Acer
 */
public class Motor {
    
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(kontakOn == true && kecepatan <= 100){
            if(kecepatan + 20 <= 100){
                kecepatan += 20;
            }
            else{
            System.out.println("Jika Kecepatan ditambah, maka akan melebihi batas maksimal\n");
        }
    }
    else if(kontakOn == true && kecepatan > 100){
            System.out.println("Kecepatan sudah maksimal");
    }
    else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
    }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 20;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan +"\n" );
    }
}
