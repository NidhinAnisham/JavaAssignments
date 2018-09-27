package com.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          

* DESCRIPTION:
Perform Heap Sort on an input Integer Array

* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  22.11.17  
* SUBMISSION DATE:  23.11.17

* Design: 
* 1) Get input number of elements
* 2) Get input array
* 3) Partition using heap tree
* 4) Sort using heap sort
* 4) Print sorted array

************************************************************************/

public class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[]) throws NumberFormatException, IOException
    {
       // int arr[] = {12, 11, 13, 5, 6, 7};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input[]=br.readLine().split(" ");
        int in[]=new int[N];
        for(int i=0;i<N;i++)
            in[i]=Integer.parseInt(input[i]);
        HeapSort ob = new HeapSort();
        ob.sort(in);
 
        System.out.println("Sorted array is");
        for(int i=0;i<N;i++)
            System.out.print(in[i]+ " "); //print sorted array 
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
	Sorted array is
	1 2 3 4 5
	
	Actual output:
	Sorted array is
	1 2 3 4 5
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	6
	7 8 9 1 2 3
	
	Expected output:
	Sorted array is
	1 2 3 7 8 9
	
	Actual output:
	Sorted array is
	1 2 3 7 8 9
	Result: PASS
***********************************************************************/