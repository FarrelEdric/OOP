/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Farrel Edric
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Processor p = new Processor("Intel i5", 3);
           Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        L.info();
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
