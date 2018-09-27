/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Comparator;

/**
 *
 * @author NI389899
 */
public class CompareBySal implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
    
}
