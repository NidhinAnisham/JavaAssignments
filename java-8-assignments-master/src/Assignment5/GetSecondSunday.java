/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author NI389899
 */
public class GetSecondSunday {
    
	public static void main (String args[]) {
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    date=date.plusMonths(1);
            int flag=0;
            for(int i=0;i<date.lengthOfMonth();i++){
                if("SUNDAY".equalsIgnoreCase(date.getDayOfWeek().toString()))
                    flag+=1;
                else
                    date=date.plusDays(1);
                if(flag==2)
                    break;
            }
            System.out.println("Date of second sunday next month: "+date.format(formatter));
	}
 
}
