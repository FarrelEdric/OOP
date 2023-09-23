/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan4;

/**
 *
 * @author Farrel Edric
 */
public class Kursi {
    String nomor;
    Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomor : " + nomor + "\n";
        if(this.penumpang != null){
            info += "Pebumpang : " + penumpang.info() + "\n";
        }
        return info;
    }
    
}

