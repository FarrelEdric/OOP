/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum;

/**
 *
 * @author Farrel Edric
 */
public class Mahasiswa {

    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    
    public void tampilBiodata(){
        System.out.println("NIM   : "+nim);
        System.out.println("NAMA  : "+nama);
        System.out.println("ALAMAT: "+alamat);
        System.out.println("KELAS : "+kelas);
    }
    
}
