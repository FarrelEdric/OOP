/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang :"+namaBrg);
        System.out.println("Jenis Barang :"+jenisBrg);
        System.out.println("Stok :"+stok);
    }
    public int tambahStoc(int brgMasuk){
    int stokBaru =brgMasuk+stok;
    return stokBaru;
    }
    }   
    
    
    

