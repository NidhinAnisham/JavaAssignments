package com.basicprogramming;

/************************************************************************
* FILENAME: BasicsOfBitManipulation.java          
*
* DESCRIPTION:
* Tap the gates as many times as there are unordered pairs of distinct integers from 1 to N whose bit-wise XOR does not exceed N.

Input:
First line contains an integer T, T testcases follow.
Each testcase consists of an integer N.

Output:
Print the answer to each testcase in a newline.

*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  09.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get number of test cases
* 2) Get input N one by one
* 3) Use nested for loops to check for ordered pairs from 1-N
* 4) Check if XOR of ordered pairs are less that N, increment counter if they are
* 5) Print value of counter

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
 
public class BasicsOfBitManipulation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        int t = 0, N = 0, count = 0;
        try {
            t = Integer.parseInt(br.readLine()); //test cases input
        } 
        catch(IOException ex){
        }
 
        while(t-- > 0) {
            try {
               N = Integer.parseInt(br.readLine()); //input N
            } catch(IOException ex) {
            }
            count = 0;
            for(int i = 1; i <= N; i++) {  //nested for loops
                for(int j = i+1; j <= N; j++) {
                    if((i ^ j) <= N)  //check for XOR < N condition
                    count++;   //increment counter if condition is satisfied
                }
            }
            out.println(count);  //print count to buffer
        }
        out.flush(); //print contents of buffer
        br = null;
        out = null;
        System.gc(); //call garbage collector
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	3
	4
	6
	8
	
	Expected output:
	3
	12
	21
	
	Actual output:
	3
	12
	21
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	10
	9
	11
	7
	14
	13
	11
	12
	8
	3
	13
	
	Expected output:
	24
	39
	21
	84
	66
	39
	51
	21
	3
	66
	
	Actual output:
	24
	39
	21
	84
	66
	39
	51
	21
	3
	66
	Result: PASS
***********************************************************************/