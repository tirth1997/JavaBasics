package Easy;

import java.util.ArrayList;
import java.util.Collections;

/*
*Problem Description



Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example:
for this problem, following are some good questions to ask :

Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= |A| <= 106
0 <= Ai <= 9


Input Format
First argument is an array of digits.



Output Format
Return the array of digits after adding one.



Example Input
Input 1:

[1, 2, 3]


Example Output
Output 1:

[1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
* */
public class AddOneToNumber {

    public static void main(String[] args) {
        AddOneToNumber addOneToNumber=new AddOneToNumber();
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(6);
        inputArray.add(4);
        inputArray.add(7);
        inputArray.add(7);
        inputArray.add(8);
        inputArray.add(9);
        ArrayList<Integer> resultArray = addOneToNumber.plusOneOptimal(inputArray);
        System.out.println("Evaluated Result is - " + resultArray);
    }
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry=1;

        for(int i=A.size()-1;i>0;i--){

            int sum=A.get(i)+carry;
            if(sum==10){
                A.set(i,0);
                carry=1;
            }else{
                A.set(i,sum);
                carry=0;
            }
        }

        int sum1=A.get(0)+carry;
        if(sum1==10){
            A.set(0,0);
            A.add(0,1);
        }else {
            A.set(0, sum1);
            while (A.get(0) == 0) {
                A.remove(A.get(0));
            }
        }
        return A;
    }

    public ArrayList<Integer> plusOneOptimal(ArrayList<Integer> digits){
        // We are reversing the original arr
        // So that we need to iterate from Back.
        Collections.reverse(digits);

        // Taking a carry variable in case if there is any carry
        int carry = 0;
        for(int i = 0; i < digits.size(); i++)
        {

            // initially  carry is 0 so this is base case
            if(i == 0)
                digits.set(i, digits.get(i) + 1 + carry);

                // If carry is not equal to zero it should be added to
                // array element at that position.
            else if(carry != 0)
                digits.set(i, digits.get(i) + carry);

            // Now to get carry, i.e.
            // If digits[i]>9 we get the value at tens place in carry
            // or else if digits[i]<9 carry will be 0
            carry = digits.get(i) / 10;

            // Now if carry is not equal to 0
            // so at that index we should keep the value present
            // at the ones place so we get digits[i]%10
            if(carry != 0)
                digits.set(i, digits.get(i) % 10);
        }

        // After doing all that if carry is still there which means
        // one more element is needed to be added to the array
        if(carry != 0)
            digits.set(digits.size() - 1, carry);

        // Now we reverse the array so that we get the final array
        Collections.reverse(digits);

        return digits;
    }
}
