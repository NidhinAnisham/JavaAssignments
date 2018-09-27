package com.datastructures;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          
*
* DESCRIPTION:
* You are given a two-dimensional 3*3 array starting from A [0][0]. You should add the alternate elements of the array and print its sum.
* It should print two different numbers the first being sum of A 0 0, A 0 2, A 1 1, A 2 0, A 2 2 and A 0 1, A 1 0, A 1 2, A 2 1.

Input Format: First and only line contains the value of array separated by single space.

Output Format: First line should print sum of A 0 0, A 0 2, A 1 1, A 2 0, A 2 2
			   Second line should print sum of A 0 1, A 1 0, A 1 2, A 2 1
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  13.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input array elements
* 2) Store array elements in array
* 3) If query starts with 1 perform updation
* 4) If query starts with 2 perform summation
* 5) Print output

************************************************************************/
/*

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MultiDimensionalArray {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = br.readLine().split(" ");     //array input
        int[] num = new int[9];
        int sumeven = 0, sumodd = 0;
        for(int i = 0; i< 9 ; i++){
            num [i] = Integer.parseInt(name[i]); 
            if(i%2 == 0)
                    sumeven = sumeven+num[i]; //even summation if number is even
            else
                    sumodd = sumodd + num[i]; //odd summation if number is odd
        }
        System.out.println(sumeven); //print even sum
        System.out.println(sumodd);  //print odd sum
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	1 2 3 4 5 6 7 8 9
	
	Expected output:
	25
	20
	
	Actual output:
	25
	20
	Result: PASS
***********************************************************************/