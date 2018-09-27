package com.datastructures;

/************************************************************************
* FILENAME: MultiDimensionalArray.java          
*
* DESCRIPTION:
* After getting her PhD, Christie has become a celebrity at her university, and her facebook profile is full of friend requests. Being the nice girl she is, Christie has accepted all the requests.

Now Kuldeep is jealous of all the attention she is getting from other guys, so he asks her to delete some of the guys from her friend list.

To avoid a 'scene', Christie decides to remove some friends from her friend list, since she knows the popularity of each of the friend she has, she uses the following algorithm to delete a friend.

Algorithm Delete(Friend):
    DeleteFriend=false
    for i = 1 to Friend.length-1
         if (Friend[i].popularity < Friend[i+1].popularity)
            delete i th friend
            DeleteFriend=true
            break
    if(DeleteFriend == false)
        delete the last friend

Input: 
First line contains T number of test cases. 
First line of each test case contains N, the number of friends Christie currently has and K ,the number of friends Christie decides to delete.
Next lines contains popularity of her friends separated by space.

Output: 
For each test case print N-K numbers which represent popularity of Christie friend's after deleting K friends.

Constraints
1<=T<=1000
1<=N<=100000
0<=K< N 
0<=popularity_of_friend<=100
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  13.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input number of test cases
* 2) Get input number of friends (frn) and number of friends to be deleted (delfrn) 
* 3) Store popularity of each friend in a Linked List
* 4) Remove friends according to algorithm specified
* 5) If algorithm condition is not satisfied, remove last friend
* 6) Print popularity of remaining friends

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class SinglyLinkedList {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  //Test cases input
        while (T-- > 0){
            String[] friends = br.readLine().split(" "); 
            int frn = Integer.parseInt(friends[0]); //number of friends
            int delfrn = Integer.parseInt(friends[1]); //number of friends to delete
            String[] frnpop =  br.readLine().split(" ");
            LinkedList<Integer> frnpoplist = new LinkedList<Integer>(); //to store popularity of friends
            for (String i : frnpop)
                frnpoplist.add(Integer.parseInt(i)); //add to linked list
            while (delfrn --  > 0){
                for (int i=0;i<frnpoplist.size();i++){
                    if (frnpoplist.get(i) < frnpoplist.get(i+1)){
                        frnpoplist.remove(i);  //remove friend if condition is satisfied
                        break;
                    }    
                }
            }
            if(frnpoplist.size()==frn)
                frnpoplist.removeLast(); //if condition is not satisfied, remove last friend
            for (int i=0;i<frnpoplist.size();i++)
                System.out.print(frnpoplist.get(i)+" ");  //print remaining friends popularity
            System.out.println();    
        }
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	3
	3 1
	3 100 1
	5 2
	19 12 3 4 17
	5 3
	23 45 11 77 18
	
	Expected output:
	100 1 
	19 12 17 
	77 18
		
	Actual output:
	100 1 
	19 12 17 
	77 18
	Result: PASS
***********************************************************************/
