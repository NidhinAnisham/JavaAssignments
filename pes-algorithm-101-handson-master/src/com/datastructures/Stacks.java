package com.datastructures;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          
*
* DESCRIPTION:
* Our monk loves food. Hence,he took up position of a manager at Sagar,a restaurant that serves people with delicious food packages. It is a very famous place and people are always queuing up to have one of those packages. Each package has a cost associated with it. The packages are kept as a pile. The job of a manager is very difficult. He needs to handle two types of queries:

1) Customer Query:
When a customer demands a package, the food package on the top of the pile is given and the customer is charged according to the cost of the package. This reduces the height of the pile by 1. 
In case the pile is empty, the customer goes away empty-handed.

2) Chef Query:
The chef prepares a food package and adds it on top of the pile. And reports the cost of the package to the Manager.
Help him manage the process.

Input:
First line contains an integer Q, the number of queries. Q lines follow.
A Type-1 ( Customer) Query, is indicated by a single integer 1 in the line.
A Type-2 ( Chef) Query, is indicated by two space separated integers 2 and C (cost of the package prepared) .

Output:
For each Type-1 Query, output the price that customer has to pay i.e. cost of the package given to the customer in a new line. 
If the pile is empty, print "No Food" (without the quotes).

*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  14.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input number of queries
* 2) Check if type 1 or type 2 query
* 3) If type 1 query, pop stack if stack is not empty otherwise print "No Food"
* 4) If type 2 query, push cost onto stack

************************************************************************/

import java.util.*;

class Stacks {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();  //input number of queries
        Stack<Integer> st = new Stack<Integer>(); //stack to store cost of food
        while(Q-->0){
            int x = sc.nextInt();
            if(x==1) //check if type 1 query
            {
                if(st.empty()) //if stack is empty
                    System.out.println("No Food");
                else
                    System.out.println(st.pop());  //pop top of stack and print food cost
            }
            else //type 2 query
                st.push(sc.nextInt());  //push cost onto stack
        }
        sc.close();
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	6
	1
	2 5
	2 7
	2 9
	1
	1
	
	Expected output:
	No Food
	9
	7
	
	Actual output:
	No Food
	9
	7
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	7
	2 7344
	2 83
	2 4314234
	1
	1
	2 16323
	2 483980
	
	Expected output:
	4314234
	83
	
	Actual output:
	4314234
	83
	Result: PASS
	
Tc03: 
	Purpose: Sample Test Case
	
	Inputs: 
	4
	1
	2 6926748
	1
	1
	
	Expected output:
	No Food
	6926748
	No Food
	
	Actual output:
	No Food
	6926748
	No Food
	Result: PASS
***********************************************************************/