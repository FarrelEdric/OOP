/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author Acer
 */
public class Anggota {

    private String noKTP;
    private String nama;
    private float limit;
    private float jump;

    Anggota(String noKTP, String nama, float limit) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
        this.jump = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public float getLimitPinjaman() {
        return limit;
    }

    public float getJump() {
        return jump;
    }

    public void pinjam(float pnjm) {
        if ((jump + pnjm) > limit) {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");
        } else {
            jump += pnjm;
        }
    }

    public void angsur(float angsr) {
        if (angsr >= jump * 10 / 100) {
            jump -= angsr;
        } else {
            System.out.println("Mohon Maaf, Angsuran "
                    + "harus 10% dari jumlah pinjaman");
        }
    }
}
