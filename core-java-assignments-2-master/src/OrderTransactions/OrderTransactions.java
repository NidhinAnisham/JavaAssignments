/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderTransactions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author NI389899
 */
public class OrderTransactions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> orderAmount = new ArrayList<>();
        System.out.println("Enter no of transactions:");
        int len = sc.nextInt();
        Transactions[] t= new Transactions[len];
        sc.nextLine();
        System.out.println("Enter input transactions: ");
        for(int k=0;k<len;k++){
            String[] input = sc.nextLine().split(";");
            t[k]= new Transactions();
            t[k].setTrans_no(input[0]);
            t[k].setTrans_mode(input[1]);
            t[k].setTrans_comp(input[2]);
            t[k].setTrans_amt(input[3]);
            orderAmount.add(input[3]);   
        }
        System.out.println(TotalAmount(orderAmount));
    }
    
    static float TotalAmount(ArrayList<String> oA){
        float total = 0;
        for (int i = 0; i < oA.size(); i++) {     
            String in = oA.get(i);
            char cv = oA.get(i).charAt(oA.get(i).length()-1);      
            float value = Float.parseFloat(in.substring(0,in.length()-1));
            switch (cv) {
                case 'M':
                    total += value*1000000;
                    break;
                case 'K':
                    total += value*1000;
                    break;
                case 'H':
                    total += value*100;
                    break;
                default:
                    break;
            }
        }
        return total;
    }
}
