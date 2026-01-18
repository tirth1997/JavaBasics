package VeryEasy;
/*
* Problem Description

Given the position of a Bishop (A, B) on an 8 * 8 chessboard.

Your task is to count the total number of squares that can be visited by the Bishop in one move.

The position of the Bishop is denoted using row and column number of the chessboard.



Problem Constraints
1 <= A, B <= 8



Input Format
First argument is an integer A denoting the row number of the bishop.

Second argument is an integer B denoting the column number of the bishop.



Output Format
Return an integer denoting the total number of squares that can be visited by the Bishop in one move.
* Youtube Ref - https://www.youtube.com/watch?v=z3d0nXyrcR4
* */
public class BishopMovement {

    //TODO write main function
    public int solve(int A, int B) {
        return Math.min(A-1,B-1) + Math.min(A-1,8-B)
                + Math.min(8-A,8-B) + Math.min(8-A,B-1);
    }
}
