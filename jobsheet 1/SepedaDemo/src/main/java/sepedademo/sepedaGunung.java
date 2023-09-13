/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepedademo;

/**
 *
 * @author Farrel Edric
 */
public class sepedaGunung extends Sepeda{
    private String tipeSuspensi;
    
    public void setTipeSuspensi1 (String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi:" + tipeSuspensi);
    }
   
}
