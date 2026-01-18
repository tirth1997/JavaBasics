package Easy;

import java.util.Stack;

/*
Problem Description



Given a string A, containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem.
Note:  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.


Problem ConstraintAdd note to connect on linked referred by friend for less than 300 character

s : 1 <= |A| <= 106

Input Format
The first and only argument is a string A.

Output Format
Return an integer, 0 / 1 ( 0 for false, 1 for true )

Example Input
Input 1:
A = "()[]{}"
Input 2:
A = "([)]"

Example Output
Output 1:1
Output 1:0
 */
public class GenerateAllParenthsis {

    public static void main(String[] args){
        String input="{}()[]";
        int valid = new GenerateAllParenthsis().isValid(input);
        if (valid==1){
            System.out.println("Valid");
        }
        else
            System.out.println("In-Valid");
    }

    public int isValid(String A) {
        int result=1,index=0,count=0;
        Stack<String> parentheisStack=new Stack<>();
        for (int i=0;i<A.length();i++){
            String s=A.substring(i,i+1);
            if (s.equals("{") ||s.equals("(") || s.equals("[")){
                parentheisStack.push(s);
            }else {
                if (parentheisStack.empty()){
                    return 0;
                }else {
                    String f = parentheisStack.pop();
                    if((s.equals(")") && f.equals("(")))
                        continue;
                    else if((s.equals("}") && f.equals("{")))
                        continue;
                    else if((s.equals("]") && f.equals("[")))
                        continue;
                    else return 0;
                }
            }
        }
        return result;
    }
}
