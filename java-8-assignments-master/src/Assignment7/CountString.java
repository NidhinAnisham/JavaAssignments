/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author NI389899
 */
public class CountString {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        int five=0,empty=0;
        str.add("Nidhin");
        str.add("");
        str.add("");
        str.add("Ram");
        str.add("Mohan");
        for(String i:str){
            if(i.length()<=5)
                five++;
            else if(i.length()==0)
                empty++;
        }
        System.out.println("Strings with five or less characters: "+five);
        System.out.println("Empty strings: "+empty);
        List<String> names = str.stream().filter(string-> string.isEmpty()).collect(Collectors.toList());
        System.out.println(names);
    }
    
}
