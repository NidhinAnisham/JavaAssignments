/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Scanner;

/**
 *
 * @author NI389899
 */
public class MyClassWithLambda{
    public static void main(String[] args){
        WordCount getWordCount = (a) -> a.length();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = in.nextLine();
        System.out.println("No of characters: "+getWordCount.count(input));
    }
}
