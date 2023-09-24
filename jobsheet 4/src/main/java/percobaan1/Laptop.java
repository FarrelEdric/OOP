/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package percobaan1;

/**
 *
 * @author Farrel Edric
 */
public class Laptop {

    private String merk;
    private Processor proc;
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    Laptop(){
    }
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}