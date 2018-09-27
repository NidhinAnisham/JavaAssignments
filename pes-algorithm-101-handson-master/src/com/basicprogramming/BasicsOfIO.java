package com.basicprogramming;

/**************************************************************************
* FILENAME: BasicsOfIO.java            
*
* DESCRIPTION:
Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
Minimum dimension of the picture can be L x L, where L is the length of the side of square.

Now Roy has N photos of various dimensions.
Dimension of a photo is denoted as W x H 
where W - width of the photo and H - Height of the photo

When any photo is uploaded following events may occur:

[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and 
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.

(quotes are only for clarification)

Given L, N, W and H as input, print appropriate text as output.

Input:
First line contains L.
Second line contains N, number of photos.
Following N lines each contains two space separated integers W and H.

Output:
Print appropriate text for each photo in a new line.

Constraints:
1 <= L,W,H <= 10000
1 <= N <= 1000   

*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com    
* START DATE: 08.11.17   
* SUBMISSION DATE: 22.11.17
*
* Design: 
* 1) Get inputs as described in problem statement for N number of photos
* 2) Check for three conditions (UPLOAD ANOTHER,ACCEPTED and CROP IT) on each photo and store it on a string 'flag' array
* 3) Output flag values for each photo

************************************************************************/

//Import Statements for console input
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BasicsOfIO {
    public static void main(String args[] ) throws Exception {       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());  //Input length constraint
        int N = Integer.parseInt(br.readLine());  //Input number of photos
        String flag[]=new String[N]; //To store condition flags for each photo
        for(int i=0;i<N;i++){
            String[] dim = br.readLine().split("\\s"); //Width and Height input given space seperated
            int W = Integer.parseInt(dim[0]); //Width of photo
            int H = Integer.parseInt(dim[1]); //Height of photo
            if( W<L || H<L )
                flag[i]="UPLOAD ANOTHER"; //width or height is less that length constraint
            else if (H!=W)
                flag[i]="CROP IT"; //photo is not square i.e. height is not equal to width
            else 
                flag[i]="ACCEPTED"; //photo is accepted
        }
        for(int i=0;i<N;i++)
            System.out.println(flag[i]);  //print flag for each photo
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	180
	3
	640 480
	120 300
	180 180
	
	Expected output:
	CROP IT
	UPLOAD ANOTHER
	ACCEPTED
	
	Actual output:
	CROP IT
	UPLOAD ANOTHER
	ACCEPTED
	
	Result: PASS
	
Tc02: 
	Purpose:Sample Test Case 2

	Inputs:
	180
	5
	640 480
	120 300
	180 180
	400 400
	200 180
	
	Expected output:
	CROP IT
	UPLOAD ANOTHER
	ACCEPTED
	ACCEPTED
	CROP IT
	
	Actual output:
	CROP IT
	UPLOAD ANOTHER
	ACCEPTED
	ACCEPTED
	CROP IT

	Result: PASS
	
Tc03: 
	Purpose: Sample Test case 3
	
	Inputs:
	640
	10
	320 320
	640 640
	640 320
	320 640
	640 480
	500 1000
	1000 500
	500 500
	1000 1000
	1 1
	
	Expected output:
	UPLOAD ANOTHER
	ACCEPTED
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	ACCEPTED
	UPLOAD ANOTHER
	
	Actual output:
	UPLOAD ANOTHER
	ACCEPTED
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	UPLOAD ANOTHER
	ACCEPTED
	UPLOAD ANOTHER

	Result: PASS	
***********************************************************************/