package Easy;
/*
*Problem Description
Given a column title A as appears in an Excel sheet, return its corresponding column number.

Problem Constraints
1 <= |A| <= 10

Input Format
First and only argument is string A.

Output Format
Return an integer

Example Input
Input 1:"A"
Input 2:"AB"

Example Output
Output 1: 1
Output 2:28

Example Explanation
Explanation 1:

 A -> 1
Explanation 2:

A  -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
* */
public class ExcelColumnNumber {

    public static void main(String[] args){

        ExcelColumnNumber excelColumnNumber=new ExcelColumnNumber();

        int result = excelColumnNumber.titleToNumber("ABC");

        System.out.println(result);
    }

    public int titleToNumber(String A) {
        int n = A.length();
        int ans = 0;
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            int c = A.charAt(i);
            int v = c - 64;
            ans += (int) Math.pow(26, p) * v;
            p++;
        }

        return ans;
    }
}
