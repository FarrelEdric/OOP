/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritace.percobaan2;

/**
 *
 * @author Farrel Edric
 */
public class ClassB extends ClassA {
    private int z;
    
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai z: " + z);
    }
    
    public void getJumlah(){
        System.out.println("jumlah: " + (getX()+getY()+z));
    }
}
