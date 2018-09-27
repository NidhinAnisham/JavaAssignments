package com.algorithms;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          

* DESCRIPTION:
You have been given an array A consisting of N integers.
All the elements in this array A are unique.
You have to answer some queries based on the elements of this array. 
Each query will consist of a single integer x. 
You need to print the rank based position of this element in this array considering that the array is 1 indexed. 
The rank based position of an element in an array is its position in the array when the array has been sorted in ascending order.

Input Format
The first line consists of a single integer N denoting the size of array A.
The next line contains N unique integers, denoting the content of array A. 
The next line contains a single integer q denoting the number of queries. 
Each of the next q lines contains a single integer x denoting the element whose rank based position needs to be printed.

Output Format
You need to print q integers denoting the answer to each query.

* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  17.11.17  
* SUBMISSION DATE:  22.11.17

* Design: 
* 1) Get input number of elements
* 2) Get input array
* 3) Search index of element using binary search
* 4) Print index of element in query which is equal to rank in sorted array

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class BinarySearch {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter o = new PrintWriter(System.out);
        int len = Integer.parseInt(br.readLine()); //length of array
        String input[]=br.readLine().split(" ");
        int in[]=new int[len];
        for(int i=0;i<len;i++)
            in[i]=Integer.parseInt(input[i]); //input array
        Arrays.sort(in);
        int Q = Integer.parseInt(br.readLine()); //number of queries
        while(Q-->0)
            o.println(binarySearch(0,len-1,Integer.parseInt(br.readLine()),in)); //searching for query using binary search
        o.flush();  //print output of all queries
        o=null;
        br=null;
        System.gc();    
    }
    
    /***********************************************************************
     * FUNCTION NAME :   binarySearch
     *
     * DESCRIPTION :     performs binary search on sorted array
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       low      Use:lower index of sub array for binary serach
     *       high     Use:highest index of array
     *					Limit: length of input array
     *		 key     Use:element to be found
     *	  	 a     Use:input array	
     *
     * OUTPUTS :
     *       RETURN : mid+1
     *            Type:  int                     
     *            Values: index of found element else -1
     *            
     ***********************************************************************/
    static int binarySearch(int low,int high,int key,int[] a)
    {
        while(low<=high)
        {
            int mid=(low + high) >> 1;
            
            if(a[mid]<key)
                low=mid+1;
            else if(a[mid]>key)
                high=mid-1;
            else
                return mid+1;
        }
        return -1; 
    }
    
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5
	1 2 3 4 5
	5
	1
	2
	3
	4
	5
	
	Expected output:
	1
	2
	3
	4
	5
	
	Actual output:
	1
	2
	3
	4
	5
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	100
	100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
	20
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	20
	
	Expected output:
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	20
	
	Actual output:
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	11
	12
	13
	14
	15
	16
	17
	18
	19
	20
	Result: PASS
***********************************************************************/