/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner irsyad = new Scanner(System.in);
        
        float pnjm;
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota    : " + donny.getNama());
        System.out.println("Limit Pinjaman  : " + donny.getLimitPinjaman());
        
        System.out.print("Masukkan Pinjaman   : ");
        donny.pinjam(irsyad.nextFloat());
        System.out.println("Jumlah Pinjaman saat ini    : " + donny.getJump());
        
        System.out.print("Masukkan Pinjaman   : ");
        donny.pinjam(irsyad.nextFloat());
        System.out.println("Jumlah Pinjaman saat ini    : " + donny.getJump());
        
        System.out.print("\nMasukkan Angsuran   : ");
        donny.angsur(irsyad.nextFloat());
        System.out.println("Jumlah Pinjaman saat ini    : " + donny.getJump());
        
        System.out.print("Masukkan Angsuran   : ");
        donny.angsur(irsyad.nextFloat());
        System.out.println("Jumlah Pinjaman saat ini    : " + donny.getJump());
        
        System.out.print("\nMasukkan Angsuran   : ");
        donny.angsur(irsyad.nextFloat());
        System.out.println("Jumlah Pinjaman saat ini    : " + donny.getJump());
    }
}
