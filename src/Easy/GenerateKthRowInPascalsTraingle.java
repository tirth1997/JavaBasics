package Easy;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Input : k = 3


Return : [1,3,3,1]

Note: k is 0 based. k = 0, corresponds to the row [1].

Note: Could you optimize your algorithm to use only O(k) extra space?
 * */
public class GenerateKthRowInPascalsTraingle {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter kth row of pascal's triangle");
        n=sc.nextInt();
        GenerateKthRowInPascalsTraingle generateKthRowInPascalsTraingle=new GenerateKthRowInPascalsTraingle();
        ArrayList<Integer> result=generateKthRowInPascalsTraingle.getRowEfficient(n);
        System.out.println(result);
    }

    public ArrayList<Integer> getRow(int A) {

        ArrayList<Integer> kThRow=new ArrayList<>();

        kThRow.add(1);

        if (A == 0) {
            return kThRow;
        }
        ArrayList<Integer> previousRow=getRow(A-1);


        for (int i=1;i<previousRow.size();i++) {
            int currentElement=previousRow.get(i-1)+ previousRow.get(i);
            kThRow.add(currentElement);
        }
        kThRow.add(1);

        return kThRow;

    }

    public ArrayList<Integer> getRowEfficient(int A) {

        ArrayList<Integer> kThRow=new ArrayList<>();
        int prev = 1;
        kThRow.add(prev);
        for(int i = 1; i <= A; i++)
        {

            // nCr = (nCr-1 * (n - r + 1))/r
            int curr = (prev * (A - i + 1)) / i;
            kThRow.add(curr);
            prev = curr;
        }
        return kThRow;
    }
}
