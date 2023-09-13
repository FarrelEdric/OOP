/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author MSI MODERN
 */
public class PintuElect extends Pintu{
    private String buka;
            
    public void Open(String newopen){
    buka = newopen;
    }
    public void cekLemari(){
        super.cekLemari();
        System.out.println("Pintu : " + buka);
    }
}
