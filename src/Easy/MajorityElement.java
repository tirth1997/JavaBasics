package Easy;

import java.util.ArrayList;
import java.util.List;

/*
* Problem Description



Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.



Problem Constraints
1 <= |A| <= 106
1 <= Ai <= 109


Input Format
The first argument is an integer array A.


Output Format
Return the majority element.


Example Input
A = [2, 1, 2]


Example Output
2


Example Explanation
2 occurs 2 times which is greater than 3/2.
* */
public class MajorityElement {

    public static void main(String[] args){
        List<Integer> input =new ArrayList<>();
        MajorityElement majorityElement=new MajorityElement();
        input.add(1);
        input.add(3);
        input.add(2);
        input.add(1);
        input.add(1);
        input.add(1);
        int result=majorityElement.majorityElementV1(input);
        System.out.println("Majority is going to be :"+result);
    }

    public int majorityElement(final List<Integer> a) {
        int aSize = a.size();
        int count = 1;
        int majorityElement = a.get(0);
        for(int i=1;i<aSize;i++) {
            if(a.get(i) == majorityElement) {
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                majorityElement = a.get(i);
                count = 1;
            }
        }
        int actualCount = 0;
        for(int i=0;i<aSize;i++) {
            if(a.get(i) == majorityElement) {
                actualCount++;
                if(actualCount > Math.floor(aSize/2)) {
                    return majorityElement;
                }
            }
        }
        return majorityElement;
    }

    public int majorityElementV1(final List<Integer> a) {
        int aSize = a.size();
        int majorityElement = findCandidate(a,aSize);
        if(isMajority(a,aSize,majorityElement)) {
            return majorityElement;
        }
        else
            return 0;
    }

    int findCandidate(List<Integer> a, int size) {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a.get(maj_index).equals(a.get(i)))
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a.get(maj_index);
    }

    boolean isMajority(List<Integer> a, int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a.get(i) == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }
}
