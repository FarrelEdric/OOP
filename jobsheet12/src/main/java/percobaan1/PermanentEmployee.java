/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author Farrel Edric
 */
public class PermanentEmployee extends Employee implements Payable{
    private int salary;
    
    public PermanentEmployee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getPaymentAmount(){
    return (int)(salary+0.5*salary);
    }
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Register as permanent employee with salary "+salary+"\n";
        return info;
    }
}