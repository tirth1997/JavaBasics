package Easy;

import java.util.Arrays;
import java.util.List;

/*
* Problem Description

Find the contiguous subarray within an array, A of length N which has the largest sum.

Problem Constraints
1 <= N <= 106
-1000 <= A[i] <= 1000

Input Format
The first and the only argument contains an integer array, A.

Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.

Example Input
Input 1: A = [1, 2, 3, 4, -10]
Input 2: A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Example Output
Output 1: 10
Output 2: 6


Example Explanation
Explanation 1: The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2: The subarray [4,-1,2,1] has the maximum possible sum of 6.
* */
public class MaximumSumInCountiousArray {

    public static void main(String[] args){
        MaximumSumInCountiousArray sumInCountiousArray=new MaximumSumInCountiousArray();
        Integer[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        List<Integer> inputList= Arrays.asList(a);
        int sum =sumInCountiousArray.maxSubArray(inputList);
        System.out.println("Max sum in continuous sub array is :- "+sum);
    }
    public int maxSubArray(final List<Integer> A) {
        int sumResult=Integer.MIN_VALUE,max_ending_here=0;

        for(Integer elementVal:A) {
            max_ending_here +=elementVal;
            if (sumResult<max_ending_here)
                sumResult=max_ending_here;
            if (max_ending_here<0)
                max_ending_here=0;
        }

        return sumResult;
    }
}
