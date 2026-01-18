package VeryEasy;
/*
* Problem Description



Find the number of integers in range [A, B] with last digit C.


Problem Constraints
1 <= A <= B <= 109
0 <= C <= 9


Input Format
Given three integers A, B and C.


Output Format
Return an integer.


Example Input
Input 1:
A = 11, B = 111, C = 1
Input 2:

A = 1, B = 9, C = 0


Example Output
Output 1:
11
Output 2:

0


Example Explanation
Explanation 1:
The integers are 11, 21, 31, 41, 51, 61, 71, 81, 91, 101, 111
Explanation 2:

There are no integers in the range with last digit 0.
* */
public class CountKlastDigit {

    public static void main(String[] args){
        int a=21,b=999,c=9,result;
        CountKlastDigit klastDigit=new CountKlastDigit();
        result=klastDigit.counLastDigitK(a,b,c);
        System.out.println("Counted numbers are :- " + result);

    }

    public int solve(int A, int B, int C) {
        int a=A;
        int b=B;
        for(int i=0;i<10;i++){
            if((a+i)%10==C) a=a+i;
        }
        for(int i=0;i<10;i++){
            if((b-i)%10==C) b=b-i;
        }
        if(a>b) return 0;
        return (b-a)/10+1;
    }

    public int counLastDigitK(int low,
                                     int high, int k)
    {
        int mlow = 10 * (int)
                Math.ceil(low/10.0);
        int mhigh = 10 * (int)
                Math.floor(high/10.0);
        int count = (mhigh - mlow)/10;
        if (high % 10 >= k)
            count++;
        if (low % 10 <= k && (low%10) > 0)
            count++;
        return count;
    }
}
