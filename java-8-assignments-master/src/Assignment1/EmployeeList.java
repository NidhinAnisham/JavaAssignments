/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.ArrayList;

/**
 *
 * @author NI389899
 */
public class EmployeeList {
    public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Nidhin","Bangalore",600000.00));
        emp.add(new Employee(2,"Ram","Chennai",500000.00));
        emp.add(new Employee(3,"Zain","Coimbatore",700000.00));
        emp.add(new Employee(4,"Kuladeep","Noida",800000.00));
        emp.add(new Employee(5,"Karan","Pune",100000.00));
        for(Employee i:emp){
            System.out.print(i.getId()+" "+i.getName()+" "+i.getAddress()+" "+i.getSalary()+"\n");
        }
    }
}
