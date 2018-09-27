package com.algorithms;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          

* DESCRIPTION:
 * You have been given an array of size N consisting of integers. 
 * In addition you have been given an element M.
 * You need to find and print the index of the last occurrence of this element M in the array if it exists in it, otherwise print -1. 
 * Consider this array to be 1 indexed.

Input Format:
The first line consists of 2 integers N and M denoting the size of the array and the element to be searched for in the array respectively .
The next line contains N space separated integers denoting the elements of of the array.

Output Format
Print a single integer denoting the index of the last occurrence of integer M in the array if it exists, otherwise print -1.

* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  17.11.17  
* SUBMISSION DATE:  22.11.17

* Design: 
* 1) Get input number of elements and element to search
* 2) Get input array
* 3) Search element in input array
* 4) Last index where element is found is given as output

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class LinearSearch {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().split(" ");
        int len = Integer.parseInt(in[0]); //length of array
        int search = Integer.parseInt(in[1]); //elements to search
        int index=-1;
        String num[]=br.readLine().split(" ");
        int input;
        for(int i=0;i<len;i++){
            input=Integer.parseInt(num[i]); //input array
            if(input==search)
                index=i+1;  //index of element if found
        }
        System.out.println(index); //print index
        br = null;
        System.gc();
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5 1
	1 2 3 4 1
	
	Expected output:
	5
	
	Actual output:
	5
	Result: PASS
	
Tc02: 
	Purpose: Not Found Case
	
	Inputs: 
	5 1
	0 2 3 4 0
	
	Expected output:
	-1
	
	Actual output:
	-1
	Result: PASS
***********************************************************************/