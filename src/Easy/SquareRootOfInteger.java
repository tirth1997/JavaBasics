package Easy;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
*Problem Description

Given an integer A.
Compute and return the square root of A.
If A is not a perfect square, return floor(sqrt(A)).
DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY.
NOTE: Do not use sort function from standard library. Users are expected to solve this in O(log(A)) time.

Problem Constraints
0 <= A <= INTMAX

Input Format
The first and only argument given is the integer A.

Output Format
Return floor(sqrt(A))

Example Input
Input 1: 11
Input 2: 9

Example Output
Output 1: 3
Output 2: 3


Example Explanation
Explanation:

 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.
 */
public class SquareRootOfInteger {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SquareRootOfInteger rootOfInteger=new SquareRootOfInteger();
        int number;
        System.out.println("Enter the number");
        // 0 <= A <= INTMAX
        number= sc.nextInt();
        System.out.println("Square root of number :- " + rootOfInteger.squareRootBinarySearch(number));
    }

    public int squareRoot(int a){
        int result;
        // for 0 and 1, the square roots are themselves
        if (a < 2)
            return a;

        // considering the equation values
        double y = a;
        double resultDouble = (y + (a / y)) / 2;

        // as we want to get upto 5 decimal digits, the
        // absolute difference should not exceed 0.00001
        while (Math.abs(y - a) >= 0.00001) {
            y = resultDouble;
            resultDouble = (y + (resultDouble / y)) / 2;
        }
        result =Integer.parseInt(new DecimalFormat("#").format(resultDouble));
        return result;
    }

    public int squareRootBinarySearch(int a){
        long ans=-1;
        long b=a;
        long l=0,h=b;
        while(l<=h){
            long mid=(l+h)/2;
            long sqr=(mid*mid);
            if(sqr==a){
                return (int)mid;
            }
            else if(sqr<a){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)ans;
    }
}
