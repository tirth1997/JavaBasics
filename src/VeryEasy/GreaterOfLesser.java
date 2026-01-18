package VeryEasy;

import java.util.ArrayList;

/**
 * Problem Description
 *
 *
 *
 * Given two integer arrays A and B, and an integer C.
 * Find the number of integers in A which are greater than C and find the number of integers in B which are less than C.
 * Return maximum of these two values.
 *
 *
 * Problem Constraints
 * 1 <= |A|, |B| <= 105
 * 1 <= Ai, Bi, C <=109
 *
 *
 * Input Format
 * First argument is an integer array A.
 * Second argument is an integer array B.
 * Third argument is an integer C.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4]
 * B = [5, 6, 7, 8]
 * C = 4
 * Input 2:
 *
 * A = [1, 10, 100]
 * B = [9, 9, 9]
 * C = 50
 *
 *
 * Example Output
 * Output 1:
 * 0
 * Output 2:
 *
 * 3
 *
 *
 * Example Explanation
 * Explanation 1:
 * There are no integers greater than C in A.
 * There are no integers less than C in B.
 * Explanation 2:
 *
 * Integers greater than C in A are [100].
 * Integers less than C in A are [9, 9, 9].
* */
public class GreaterOfLesser {

    public static void main(String[] args){
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(8);
        int C=4;
        GreaterOfLesser greaterOfLesser=new GreaterOfLesser();
        int result=greaterOfLesser.solve(A,B,C);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int countA=0,countB=0;
        countA = (int)A.stream()
                .filter(x-> x>C).count();
        countB = (int)B.stream()
                .filter(x-> x<C).count();
        return Math.max(countA,countB);
    }
}
