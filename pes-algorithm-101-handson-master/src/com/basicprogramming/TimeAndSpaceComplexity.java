package com.basicprogramming;

/************************************************************************
* FILENAME: TimeAndSpaceComplexity.java          
*
* DESCRIPTION:
* Program to demonstrate O(N2) and O(N) time complexity
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  08.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Use nested for loops for O(N2)
* 2) Use nested for loops with lower time complexity

************************************************************************/

public class TimeAndSpaceComplexity {
	public static void main(String args[]){
		int count = 0;
		for (int i = 0; i < 100; i++) 
			for (int j = 0; j < i; j++) 
					count++;
			/*Lets see how many times count++ will run. 
		 	When i=0, it will run 0 times.
			i=1, it will run 1 times.
			When i=2, it will run 2 times and so on.
			Total number of times count++ will run is 0+1+2+...+(N−1)=N∗(N−1)2. So the time complexity will be O(N2).*/
		System.out.println("O(N2) complexity: "+count);
		count = 0;
		for (int i = 100; i > 0; i /= 2) 
		    for (int j = 0; j < i; j++) 
		        count++;
			/*This is a tricky case. In the first look, it seems like the complexity is O(N*logN). 
			N for the j′s loop and logN for i′s loop. But its wrong. Lets see why.
			Think about how many times count++ will run.
			When i=N, it will run N times.
			When i=N/2, it will run N/2 times.
			When i=N/4, it will run N/4 times and so on.
			Total number of times count++ will run is N+N/2+N/4+...+1=2*N. So the time complexity will be O(N).*/
		System.out.println("O(N) complexity: "+count);
	}
}
