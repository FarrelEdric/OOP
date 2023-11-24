/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Farrel Edric
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length=length;
        this.name=name;
    }
    
    public int getLength(){
    return length;
    }
    public void setLength(int length){
    this.length=length;
    }
    
    public String getEmployeeInfo(){
    String info = super.getEmployeeInfo()+"\n";
    info+="Registered as internship employee for "+length+" month/s\n";
    return info;
    }
}
