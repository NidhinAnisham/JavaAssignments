package com.basicprogramming;

/************************************************************************
* FILENAME: BasicsOfImplementation.java          
*
* DESCRIPTION:
* Given an Array A consisting of N positive integers, you have to answer Q queries on it.
* Queries can be of the two types: * 1 X Y - Update X at location Y in the array. 
* 								   * 2 L R - Print the sum of range [L, R], i.e. Both L and R are inclusive.
*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  09.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get number of elements and number of queries
* 2) Get array elements
* 3) If query starts with 1 perform updation
* 4) If query starts with 2 perform summation
* 5) Print output

************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class BasicsOfImplementation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(input.nextToken()); //Number of array elements
        int Q = Integer.parseInt(input.nextToken()); //Number of Queries
        int[] numbers = new int[N];
        input = new StringTokenizer(reader.readLine()); //for array input
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = Integer.parseInt(input.nextToken()); //getting input array
        while (Q-- > 0) {
            input = new StringTokenizer(reader.readLine());
            if (Integer.parseInt(input.nextToken()) == 1) { //if query is 1 
                int x = Integer.parseInt(input.nextToken());  //get x location 
                int y = Integer.parseInt(input.nextToken());  //get y value
                numbers[x] = y; //update value at x to y
            } 
            else {  //if query is 2
                int l = Integer.parseInt(input.nextToken()); //get lower index
                int r = Integer.parseInt(input.nextToken()); //get higher index
                if((r - l) <= numbers.length -1){ //check if indices are within bound of array
                    int sum = 0;
                    for(int i=l; i<=r; i++)
                        sum = sum + numbers[i]; //summation
                    System.out.println(sum); //print sum
                }
                else
                    System.out.println(-1);
            }
        }
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	5 5
	2 3 4 8 9
	1 0 3
	2 0 1
	2 0 4
	1 2 5
	2 0 3
	
	Expected output:
	6
	27
	19
	
	Actual output:
	6
	27
	19
	Result: PASS
	
Tc02: 
	Purpose:Sample Test Case 2

	Inputs:
	74 74
	335 680 224 691 664 325 352 352 837 590 475 702 910 774 484 75 166 544 959 708 350 526 155 796 457 455 136 496 569 190 354 678 490 401 150 592 894 791 244 555 289 429 782 317 885 275 536 926 977 10 657 110 165 969 905 280 570 33 763 165 567 53 557 980 631 446 549 944 761 670 214 474 648 379
	2 46 58
	1 23 891
	1 47 580
	1 19 702
	2 51 72
	2 65 68
	2 55 58
	1 2 291
	2 31 52
	1 7 302
	2 43 73
	1 64 379
	1 67 951
	1 60 372
	1 6 172
	1 40 118
	2 19 27
	1 18 895
	2 61 70
	1 15 122
	1 70 861
	2 50 51
	2 73 73
	2 1 66
	1 62 438
	2 20 49
	1 73 518
	1 47 202
	1 25 657
	2 24 32
	1 46 526
	2 38 60
	1 23 573
	2 40 43
	1 60 27
	2 36 66
	1 64 554
	2 55 61
	2 19 37
	2 37 69
	2 49 70
	2 57 62
	2 39 56
	2 22 34
	1 46 388
	2 59 68
	1 3 757
	1 63 932
	1 32 911
	2 69 69
	2 68 71
	1 73 654
	1 41 686
	2 53 57
	1 31 847
	2 23 58
	1 60 480
	2 69 72
	1 24 214
	1 35 42
	1 40 276
	2 17 59
	1 10 947
	2 30 52
	1 42 282
	1 25 289
	2 34 57
	2 30 73
	2 10 10
	2 63 63
	2 33 45
	2 27 71
	1 30 198
	2 70 71
	1 11 556
	
	Expected output:
	6901
	11454
	2700
	1646
	10807
	16070
	4168
	5560
	767
	379
	32562
	14283
	4027
	10309
	1646
	14494
	1891
	9161
	16157
	10917
	1479
	8732
	5306
	4924
	670
	2766
	2757
	17909
	2653
	20611
	10919
	10663
	22575
	947
	932
	5798
	22528
	1335

	
	Actual output:
	6901
	11454
	2700
	1646
	10807
	16070
	4168
	5560
	767
	379
	32562
	14283
	4027
	10309
	1646
	14494
	1891
	9161
	16157
	10917
	1479
	8732
	5306
	4924
	670
	2766
	2757
	17909
	2653
	20611
	10919
	10663
	22575
	947
	932
	5798
	22528
	1335

	Result: PASS
***********************************************************************/