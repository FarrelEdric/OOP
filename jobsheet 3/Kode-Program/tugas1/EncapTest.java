/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Acer
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        
        encap.setName("James");
        encap.setAge(35);
        encap2.setName("Maria");
        encap2.setAge(14);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age  : " + encap2.getAge());
    }
}
