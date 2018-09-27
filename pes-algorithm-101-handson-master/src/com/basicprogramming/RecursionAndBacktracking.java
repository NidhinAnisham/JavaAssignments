package com.basicprogramming;

/************************************************************************
* FILENAME: RecursionAndBacktracking.java          
*
* DESCRIPTION:
* Given a chess board having N—N cells, you need to place N queens on the board in such a way that no queen attacks any other queen.

*
* AUTHOR:    389899 | Nidhin Anisham | nidhin.anisham@wipro.com     
* START DATE:  10.11.17  
* SUBMISSION DATE:  22.11.17
*
* Design: 
* 1) Get input N
* 2) Create 2D array of size NxN
* 3) Use nested for loops to check for safe position of queens on board
* 4) Print safe positions for queen

************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class RecursionAndBacktracking {
    
    static int board[][];
    static int N;
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        N = Integer.parseInt(line);  //size of board
        board = new int [N][N]; //creating board
        if (nQueenSolve(0)) { //start at 0,0
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");  //printing board
                }
                System.out.println();
            }
        } else {
            System.out.print("Not possible"); //not possible if queen can't be placed at 0,0  
        }
    }
    
    /***********************************************************************
    * FUNCTION NAME :   nQueenSolve
    *
    * DESCRIPTION :     Decides Queen placement on board
    *
    * INPUTS :
    *       FUNCTION PARAMETERS:
    *       level      Use:Iterate
    *					Limit: N
    *       GLOBALS used and their purpose:	
    *       N : Length & Breadth of board
    *       board[][] : stores values on board		
    *
    * OUTPUTS :
    *       RETURN :
    *            Type:  Boolean                     
    *            Values: false if queens can't be arranged according to condition else true
    *           
    *       GLOBALS modified: board[][]
    *            
    ***********************************************************************/
    
    private static boolean nQueenSolve(int level) {
        for (int i = 0; i < N; i++) {
            if (isSafePosition(level, i)) { //checks for safe position on board
                board[level][i] = 1;
                if (level == N - 1) {
                    return true;
                } 
                else {
                    if(!nQueenSolve(level + 1)) {
                        board[level][i] = 0;
                        continue;
                    }
                    else {
                    	return true;
                    }
                }
            }
        }
        return false;
    }
    
    /***********************************************************************
     * FUNCTION NAME :   isSafePosition
     * DESCRIPTION :     Decides if Queen placement on that particular box is safe
     *
     * INPUTS :
     *       FUNCTION PARAMETERS:
     *       x      Use:x position of board
     *				Limit: N
     *       y     Use:y position of board
     *				Limit: N
     *		...
     *       GLOBALS used and their purpose:	
     *       N : Length & Breadth of board
     *       board[][] : stores values on board		
     *
     * OUTPUTS :
     *       RETURN :
     *            Type:  Boolean                     
     *            Values: false if position is not safe for queen placement else true
     *            
     ***********************************************************************/
    
    private static boolean isSafePosition(int x, int y) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N && !(board[i][j] == 1 && x == i && y==j); j++) {
                if (board[i][j] == 1 && (x == i || y == j || (x + y == i + j) || (x - y == i - j))) {  //diagonals check
                    return false;
                }
            }
        }
        return true;
    }
}

/***********************************************************************
Test Cases:
Tc01: 
	Purpose: Sample Test Case
	
	Inputs: 
	7
	
	Expected output:
	1 0 0 0 0 0 0 
	0 0 1 0 0 0 0 
	0 0 0 0 1 0 0 
	0 0 0 0 0 0 1 
	0 1 0 0 0 0 0 
	0 0 0 1 0 0 0 
	
	Actual output:
	1 0 0 0 0 0 0 
	0 0 1 0 0 0 0 
	0 0 0 0 1 0 0 
	0 0 0 0 0 0 1 
	0 1 0 0 0 0 0 
	0 0 0 1 0 0 0 
	Result: PASS
	
Tc02: 
	Purpose: Sample Test Case
	
	Inputs: 
	5
	
	Expected output:
	1 0 0 0 0 
	0 0 1 0 0 
	0 0 0 0 1 
	0 1 0 0 0 
	0 0 0 1 0
	
	Actual output:
	1 0 0 0 0 
	0 0 1 0 0 
	0 0 0 0 1 
	0 1 0 0 0 
	0 0 0 1 0
	Result: PASS
***********************************************************************/
