package com.algorithms;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          

* DESCRIPTION:
Given an array A on size N, you need to find the number of ordered pairs (i,j) such that i<j andA[i]>A[j].

Input:
First line contains one integer N, size of array.
Second line contains N space separated integers denoting the elements of the array A.

Output:
Print the number of ordered pairs (i,j) such that i<j and A[i]>A[j] in different subarray slots.

* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  20.11.17  
* SUBMISSION DATE:  23.11.17

* Design: 
* 1) Get input number of elements
* 2) Get input array
* 3) Sort using merge sort
* 4) Merge individually sorted slots
* 5) Whenever i<j and A[i]>A[j], increment count
* 6) Print count

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MergeSort {
    static int count = 1;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());      
        String[] in= br.readLine().split(" ");
        int input[]=new int[len];
        for(int i=0;i<len;i++)
            input[i]=Integer.parseInt(in[i]); //integer array input
        sort(input,0,len-1); //merge sort
        System.out.println(count); //print sorted array
    }
    
    /***********************************************************************
     * FUNCTION NAME :   merge
     *
     * DESCRIPTION :     merges slotted slot
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       arr     Use:input array
     *       l       Use:lower index of subarray
     *		 r       Use:higher index of subarray
     *	  	 m       Use:(l+r)/2	       
     ***********************************************************************/
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] >= R[j])
            {
                arr[k] = R[j];
                j++;
                count++;
            }
            else
            {
                
                arr[k] = L[i];
                i++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    /***********************************************************************
     * FUNCTION NAME :   sort
     *
     * DESCRIPTION :     performs sort function of both right and left slots
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       arr     Use:input array
     *       l       Use:lower index of subarray
     *		 r       Use:higher index of subarray       
     ***********************************************************************/
    static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }    
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5
	1 4 3 2 5
	
	Expected output:
	3
	
	Actual output:
	3
	Result: PASS
	
***********************************************************************/