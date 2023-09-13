/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Farrel Edric
 */public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "JL. Vinolia NO 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Edd";
        mhs2.alamat = "JL. Lapu-Lapu NO 2B";
        mhs2.kelas = "2B";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Bojem";
        mhs3.alamat = "JL. Poqe NO 3C";
        mhs3.kelas = "3C";
        mhs3.tampilBiodata();
    }
}

