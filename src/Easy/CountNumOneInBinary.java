package Easy;

/*
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
0 <= A <= 4294967295

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Example Input
Input1:11

Example Output
Output1:3

Example Explanation
Explaination1: 11 is represented as 1101 in binary
 */
public class CountNumOneInBinary {

    public static void main(String[] args) {
        CountNumOneInBinary countNumOneInBinary = new CountNumOneInBinary();
        int result = countNumOneInBinary.numSetBitsEfficient(11);
        System.out.println(result);
    }

    int numSetBits(int A) {

        String brinaryString = Integer.toBinaryString(A);
        int count = 0;

        for (int i = 0; i < brinaryString.length(); i++) {
            if (brinaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    int numSetBitsEfficient(int A) {
        int onesCount = 0;
        while (A > 0) {
            //
            if ((A & 1) == 1) {
                onesCount++;
            }
            A = A >> 1;
        }
        return onesCount;
    }
}
