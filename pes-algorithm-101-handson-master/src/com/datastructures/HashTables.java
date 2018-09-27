package com.datastructures;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          
*
* DESCRIPTION:
* Our friend Monk has been made teacher for the day today by his school professors.
* He is going to teach informatics to his colleagues as that is his favorite subject . 
* Before entering the class, Monk realized that he does not remember the names of all his colleagues clearly . 
* He thinks this will cause problems and will not allow him to teach the class well. 
* However, Monk remembers the roll number of all his colleagues very well .
* Monk now wants you to help him out. He will initially give you a list indicating the name and roll number of all his colleagues. 
* When he enters the class he will give you the roll number of any of his colleagues belonging to the class.
* You need to revert to him with the name of that colleague.

Input Format
The first line contains a single integers N denoting the number of Monk's colleagues.
Each of the next N lines contains an integer and a String denoting the roll number and name of the i th colleague of Monk.
The next Line contains a single integer q denoting the number of queries Monk shall present to you when he starts teaching in class.
Each of the next q lines contains a single integer x denoting the roll number of the student whose name Monk wants to know.

Output Format
You need to print q Strings, each String on a new line, indicating the answers to each of Monk's queries.

Note
The name of each student shall consist of lowercase English alphabets only. It is guaranteed that the roll number appearing in each query shall belong to some student from the class.
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  16.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input number of students
* 2) Get input roll no and name. Store in HashMap
* 3) Get queries with roll numbers
* 4) Search for names pertaining to queried roll no and display to output

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class HashTables {
    public static void main(String args[] ) throws Exception {
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine()); //number of students
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); //to store roll no, name pair
        for(int i=0;i<N;i++){
            String[] in = br.readLine().split(" ");
            hm.put(Integer.parseInt(in[0]),in[1]); //storing roll no,name pair
        }
        int Q = Integer.parseInt(br.readLine());  //number of queries
        for(int i=0;i<Q;i++)
            out.println(hm.get(Integer.parseInt(br.readLine()))); //getting roll number and printing names using get()
        out.flush(); //printing output of all queries
        out = null;
        br = null;
        System.gc(); //calling garbage collector
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5
	1 vasya
	2 petya
	3 kolya
	4 limak
	5 illya
	2
	1
	2
	
	Expected output:
	vasya
	petya
	
	Actual output:
	vasya
	petya
	Result: PASS
	
***********************************************************************/