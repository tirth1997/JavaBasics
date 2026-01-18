package Easy;

import java.util.ArrayList;
import java.util.List;

/*
*
Problem Description

The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11. 11 is read off as two 1s or 21.
21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example: if n = 2, the sequence is 11.
*
* */
public class CountAndSay {

    public String countAndSay(int A) {
        // vector to store all the intermediary results
        Integer n =A;
        List<String> dp = new ArrayList<>(n + 1);

        // initialization
        dp.add("1");
        for (int i = 2; i <= n; i++) {
            String prev = dp.get(i - 1 - 1);
            String curr = "";
            for (int j = 0; j < prev.length(); j++) {
                int count = 1;
                while (j + 1 < prev.length() && prev.charAt(j) == prev.charAt(j + 1)) {
                    count++;
                    j++;
                }
                curr += Integer.toString(count) + prev.charAt(j);
            }
            dp.add(curr);
        }
        return dp.get(n - 1);
    }

    public static void main(String[] args){
        CountAndSay countAndSay=new CountAndSay();

        String result = countAndSay.countAndSay(5);

        System.out.println(result);
    }
}
