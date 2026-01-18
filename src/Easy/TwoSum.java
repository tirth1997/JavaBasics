package Easy;

import java.util.*;

/*
 * Problem Description



Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return an empty list.
If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.


Problem Constraints
1 <= |A| <= 105
-108 <= Ai <= 108
-108 <= B <= 108

Input Format
The first argument is an integer array A.
The second argument is an integer B.

Output Format
Return an array of integer, representing the answer

Example Input
A: [2, 7, 11, 15]
B: 9

Example Output
[1, 2]

Example Explanation
The elements present at index 1 and index 2 add up to 9. i.e. A[1] + A[2] = 9 (1-based indexing)
 * */
public class TwoSum {

    public static void main(String[] args){
        TwoSum twoSum=new TwoSum();
        List<Integer> inputList= Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8);
        ArrayList<Integer> result = twoSum.twoSum(inputList,-3);
        System.out.println(result);
        //System.out.println("value at Index "+result.get(0)+"is"+inputList.get(result.get(0)-1));
        //System.out.println("value at Index "+result.get(1)+"is"+inputList.get(result.get(1)-1));

    }

    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(map.containsKey(B-A.get(i))){
                al.add(map.get(B-A.get(i)));
                al.add(i+1);
                break;
            }
            else{
                if(map.containsKey(A.get(i))){
                    continue;
                }
                else{
                    map.put(A.get(i),i+1);
                }

            }
        }
        return al;
    }
}
