/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author NI389899
 */
public class EmpTest {
     public static void main(String[] args){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Nidhin","Bangalore",60000));
        emp.add(new Employee(2,"Ram","Chennai",50000));
        emp.add(new Employee(3,"Zain","Coimbatore",70000));
        emp.add(new Employee(4,"Kuladeep","Noida",8000));
        emp.add(new Employee(5,"Karan","Pune",10000));
        Collections.sort(emp,new CompareBySal());
        for (int i=0; i<emp.size(); i++)
            System.out.println(emp.get(i));
    }
}

