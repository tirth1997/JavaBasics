package VeryEasy;

import java.util.ArrayList;

/*
* Given an sorted array A of size N. Find number of elements which are less than or equal to B.

NOTE: Expected Time Complexity O(log N)
* 1 <= N <= 106

1 <= A[i], B <= 109
* */
public class SmallestOrEquivalentCount {

    public static void main(String[] args){

    }

    public int solve(ArrayList<Integer> A, int B) {
        int result=0,left=0,r;
        r = A.size()-1;
        while(left<=r){
            int mid = (left+r)/2;
            if(A.get(mid)==B){
                result = mid+1;
                left=mid+1;
            }else if(A.get(mid) < B){
                left = mid + 1;
                result = mid+1;
            }
            else{
                r = mid - 1;
                result = mid;
            }
        }
        return result;
    }

}
