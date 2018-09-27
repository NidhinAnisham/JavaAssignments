/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author NI389899
 */
public class WiproExperience {
    public static void main(String[] args){
        LocalDate dateTime = LocalDate.now();
        LocalDate joinDate = LocalDate.of(2017, Month.AUGUST, 21);
        Period diff = Period.between(joinDate,dateTime);
        System.out.println("Experience in Wipro: "+diff.getDays()+"days "+diff.getMonths()+"months "+diff.getYears()+"years");
    }
    
}
