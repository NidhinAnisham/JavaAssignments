package com.datastructures;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          
*
* DESCRIPTION:
* Micro just purchased a queue and wants to perform N operations on the queue. The operations are of following type:
E x : Enqueue x in the queue and print the new size of the queue.
D : Dequeue from the queue and print the element that is deleted and the new size of the queue separated by space.
 	If there is no element in the queue then print -1 in place of deleted element.

Since Micro is new with queue data structure, he need your help.

Input:
First line consists of a single integer denoting N
Each of the following N lines contain one of the operation as described above.

Output:
For each enqueue operation print the new size of the queue. And for each dequeue operation print two integers, deleted element (-1, if queue is empty) and the new size of the queue.
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  15.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input number of test cases
* 2) Check if operation is E or D
* 3) If E, add element and output total number of elements
* 4) If D, remove elements and output total number of elements. Output -1 if queue is empty

************************************************************************/

import java.util.*;

class Queues {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int n = 0;
        Queue<String> queue=new LinkedList<String>();
        while(T-- > 0){
            String C = s.next();
            if(C.equals("E")){
                String in = s.next();
                queue.add(in);
                n++;
                System.out.println(n);
            }
            else if(C.equals("D")){
                if(queue.isEmpty()){
                    System.out.println("-1 0");
                }
                else{
                    n--;
                    System.out.println(queue.remove()+" "+n);
                }
            }
        }
        s.close();
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5
	E 2
	D
	D
	E 3
	D
	
	Expected output:
	1
	2 0
	-1 0
	1
	3 0
	
	Actual output:
	1
	2 0
	-1 0
	1
	3 0
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	10
	D
	D
	E 51
	E 64
	E 44
	D
	E 54
	E 74
	D
	E 47
	
	Expected output:
	-1 0
	-1 0
	1
	2
	3
	51 2
	3
	4
	64 3
	4
	
	Actual output:
	-1 0
	-1 0
	1
	2
	3
	51 2
	3
	4
	64 3
	4
	Result: PASS
***********************************************************************/