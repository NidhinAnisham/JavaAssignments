/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.Arrays;

/**
 *
 * @author NI389899
 */
public class EmpTest {
    public static void main(String[] args){
        Employee emp[]=new Employee[10];
        for(int i=0;i<10;i++)
            emp[i]=new Employee();
        emp[0].setEmpNo(1);
        emp[0].seteName("Nidhin");
        emp[0].setDepartmentName("BAS");
        emp[0].setLocation("Bangalore");
        emp[0].setSalary(10000);
        
        emp[1].setEmpNo(2);
        emp[1].seteName("Manoj");
        emp[1].setDepartmentName("CSP");
        emp[1].setLocation("Noida");
        emp[1].setSalary(5000);
        
        emp[2].setEmpNo(3);
        emp[2].seteName("Ram");
        emp[2].setDepartmentName("NEP");
        emp[2].setLocation("Chennai");
        emp[2].setSalary(90000);
        
        emp[3].setEmpNo(4);
        emp[3].seteName("Mohan");
        emp[3].setDepartmentName("PES");
        emp[3].setLocation("Coimbatore");
        emp[3].setSalary(800);
        
        emp[4].setEmpNo(5);
        emp[4].seteName("Raj");
        emp[4].setDepartmentName("MFG");
        emp[4].setLocation("Bangalore");
        emp[4].setSalary(10000);
        
        emp[5].setEmpNo(6);
        emp[5].seteName("Arjun");
        emp[5].setDepartmentName("CBU");
        emp[5].setLocation("Pune");
        emp[5].setSalary(7000);
        
        emp[6].setEmpNo(7);
        emp[6].seteName("Salman");
        emp[6].setDepartmentName("GIS");
        emp[6].setLocation("Pune");
        emp[6].setSalary(900000);
        
        emp[7].setEmpNo(8);
        emp[7].seteName("Dhoni");
        emp[7].setDepartmentName("CSP");
        emp[7].setLocation("Bangalore");
        emp[7].setSalary(10000);
        
        emp[8].setEmpNo(9);
        emp[8].seteName("Kohli");
        emp[8].setDepartmentName("NEP");
        emp[8].setLocation("Mumbai");
        emp[8].setSalary(90000);
        
        emp[9].setEmpNo(10);
        emp[9].seteName("Bruce");
        emp[9].setDepartmentName("BAS");
        emp[9].setLocation("Bangalore");
        emp[9].setSalary(3000);    
        
        Arrays.sort(emp);
        for(int i=0;i<10;i++){
		   System.out.println(emp[i].getEmpNo());
                   System.out.println(emp[i].geteName());
                   System.out.println(emp[i].getDepartmentName());
                   System.out.println(emp[i].getLocation());
                   System.out.println(emp[i].getSalary());
                   System.out.println();
        }
    }
}
