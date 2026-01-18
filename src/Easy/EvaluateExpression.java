package Easy;

import java.util.ArrayList;
import java.util.Stack;

/*
* Problem Description

An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each string may be an integer or an operator.

Problem Constraints
1 <= N <= 105

Input Format
The only argument given is string array A.

Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.

Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]

Example Output
Output 1:
    9
Output 2:
    6

Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    13 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6
* */
public class EvaluateExpression {

    public static void main(String[] args){
        EvaluateExpression evaluateExpression=new EvaluateExpression();
        ArrayList<String> inputArray=new ArrayList<>();
        inputArray.add("4");
        inputArray.add("13");
        inputArray.add("5");
        inputArray.add("/");
        inputArray.add("+");
        int result = evaluateExpression.evalRPN(inputArray);
        System.out.println("Evaluated Result is - "+result);
    }

    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> stack = new Stack<Integer>();
        if (A.size() < 3)
            return Integer.valueOf(A.get(A.size() - 1));
        for (int i = 0; i < A.size(); i++) {

            String str = A.get(i);

            if (str.matches("-?[0-9]+")) stack.push(Integer.valueOf(str));

            else {

                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();

                if (str.equals("+"))
                    stack.push(a + b);

                else if (str.equals("-"))
                    stack.push(b - a);

                else if (str.equals("*"))
                    stack.push(a * b);

                else
                    stack.push(b / a);

            }

        }
        return stack.peek();
    }
}
