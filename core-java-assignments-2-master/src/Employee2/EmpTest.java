/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee2;
/**
 *
 * @author NI389899
 */
public class EmpTest {
    public static void main(String[] args) throws SalOverflow{
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        emp1.setEmpNo(1);
        emp1.seteName("Nidhin");
        emp1.setDepartmentName("BAS");
        emp1.setLocation("Bangalore");
        emp1.setSalary(10000);
        
        emp2.setEmpNo(2);
        emp2.seteName("Manoj");
        emp2.setDepartmentName("CSP");
        emp2.setLocation("Noida");
        emp2.setSalary(5000);
        System.out.println(emp1.getEmpNo());
        System.out.println(emp1.geteName());
        System.out.println(emp1.getDepartmentName());
        System.out.println(emp1.getLocation());
        System.out.println(emp1.getSalary());
        System.out.println();

        System.out.println(emp2.getEmpNo());
        System.out.println(emp2.geteName());
        System.out.println(emp2.getDepartmentName());
        System.out.println(emp2.getLocation());
        System.out.println(emp2.getSalary());
        System.out.println();
        
        System.out.println(emp1.geteName()+" new salary is "+emp1.salIncrease(10));
        System.out.println(emp2.geteName()+" new salary is "+emp2.salIncrease(110));
    }
}
