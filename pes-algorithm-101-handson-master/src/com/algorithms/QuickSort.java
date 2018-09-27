package com.algorithms;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          

* DESCRIPTION:
Perform Quick Sort on an input Integer Array

* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  21.11.17  
* SUBMISSION DATE:  23.11.17

* Design: 
* 1) Get input number of elements
* 2) Get input array
* 3) Partition using pivot
* 4) Sort using quick sort
* 4) Print sorted array

************************************************************************/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class QuickSort {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input[]=br.readLine().split(" ");
        int in[]=new int[N];
        for(int i=0;i<N;i++)
            in[i]=Integer.parseInt(input[i]); //integer array input
        sort(in,0,N-1);
        for(int i=0;i<N;i++)
            System.out.print(in[i]+ " "); //print sorted array 
    }
    
    /***********************************************************************
     * FUNCTION NAME :   sort
     *
     * DESCRIPTION :     performs sort function of both right and left slots of pivot
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       a          Use:input array
     *       start      Use:lower index of subarray
     *		 end        Use:higher index of subarray       
     ***********************************************************************/
    static void sort(int[] a,int start,int end){
        if(start<end){
            int pi=partition(a,start,end);
            sort(a,start,pi-1);
            sort(a,pi+1,end);
        }
    }
    
    /***********************************************************************
     * FUNCTION NAME :   partition
     *
     * DESCRIPTION :     gets index of pivot
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       arr        Use:input array
     *       low        Use:lower index of subarray
     *		 high       Use:higher index of subarray	       
     ***********************************************************************/
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
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
	1 2 3 4 5
	
	Actual output:
	1 2 3 4 5
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	6
	7 8 9 1 2 3
	
	Expected output:
	1 2 3 7 8 9
	
	Actual output:
	1 2 3 7 8 9
	Result: PASS
***********************************************************************/