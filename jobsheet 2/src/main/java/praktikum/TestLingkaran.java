/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */
import java.util.Scanner;

public class TestLingkaran {
    public static void main(String[] args) {
        Scanner Farrel = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        double jariJari;
        int pilihan;
        do {
            System.out.print("Masukkan jari-jari lingkaran: ");
            jariJari = Farrel.nextDouble();
            double luas = lingkaran.hitungLuas(jariJari);
            double keliling = lingkaran.hitungKeliling(jariJari);
            System.out.println("\nLingkaran");
            System.out.println("Jari-jari: " + jariJari);
            System.out.println("1. Hitung Luas");
            System.out.println("2. Hitung Keliling");
            System.out.println("3. Keluar");
            System.out.print("Pilih operasi (1/2/3): ");
            pilihan = Farrel.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Luas: " + luas);
                    break;
                case 2:
                    System.out.println("Keliling: " + keliling);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
        Farrel.close();
    }
}

