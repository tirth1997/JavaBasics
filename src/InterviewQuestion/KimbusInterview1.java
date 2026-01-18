package InterviewQuestion;
/*
* There is a bookstore owner that has a store open for n minutes. Every minute, some number of
customers enter the store. You are given an integer array of customers of length n where
customers[i] is the number of the customer that enters the store at the start of the i th minute and all
those customers leave after the end of that minute.
For a few minutes, the bookstore owner is grumpy. You are given a binary array grumpy where
grumpy[i] is 1 if the bookstore owner is grumpy during the i th minute, and is 0 otherwise.
When the bookstore owner is grumpy, the customers are not satisfied, otherwise, they are satisfied.
The bookstore owner knows a secret technique to keep themselves not grumpy for consecutive
minutes, but can only use it once.
Find out the maximum number of customers that can be satisfied throughout the day.
Example:
Input:
customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
Output:
16
Explanation:
The bookstore owner keeps themselves not grumpy for the last 3 minutes.
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
Constraints:● n == customers.length == grumpy.length
● 1 <= minutes <= n <= 2 * 104
● 0 <= customers[i] <= 1000
● grumpy[i] is either 0 or 1.
*
*1 Calculate the total number of satisfied customers by iterating through
* the customers array and adding the value to a total variable if grumpy[i] is 0.

2Calculate the number of unsatisfied customers by iterating through the
* customers array and adding the value to a separate variable if grumpy[i] is 1.

3 Calculate the maximum number of unsatisfied customers that
* can be converted to satisfied customers by using the secret technique.
* To do this, iterate through the customers array and keep track of
* the running sum of unsatisfied customers for the last "minutes" minutes.
* Keep track of the maximum running sum, and subtract it from the total number of unsatisfied customers to get the number of customers that can be converted to satisfied customers.

4 Add the number of customers that can be converted to satisfied customers
*  to the total number of satisfied customers from step 1 to get the final answer.
*
* Test case 1: customers = [1,2,3,4,5], grumpy = [1,1,1,1,1], minutes = 3. Output: 15
Test case 2: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3. Output: 16
Test case 3: customers = [1,1,1,1,1,1,1,1,1,1], grumpy = [1,1,1,1,1,1,1,1,1,1], minutes = 3. Output: 10
Test case 4: customers = [1,1,1,1,1,1,1,1,1,1], grumpy = [0,0,0,0,0,0,0,0,0,0], minutes = 3. Output: 10
Test case 5: customers = [2,5,7,8,9,10,5,1,0,1], grumpy = [1,1,0,0,0,0,1,1,0,1], minutes = 3. Output: 36
Test case 6: customers = [2,2,2,2,2,2,2,2,2,2], grumpy = [1,1,0,0,0,0,1,1,0,1], minutes = 3. Output: 20
Test case 7: customers = [1,1,1,1,1,1,1,1,1,1], grumpy = [1,0,1,0,1,0,1,0,1,0], minutes = 3. Output: 10
Test case 8: customers = [0,0,0,0,0,0,0,0,0,0], grumpy = [1,0,1,0,1,0,1,0,1,0], minutes = 3. Output: 0
Test case 9: customers = [1,2,3,4,5,6,7,8,9,10], grumpy = [0,0,0,0,0,0,0,0,0,0], minutes = 3. Output: 55
Test case 10: customers = [2,3,4,5,6,7,8,9,10,1], grumpy = [1,1,1,1,1,1,1,1,1,1], minutes = 3. Output: 15
*
* */
public class KimbusInterview1 {

    public static void main(String[] args) {
        int[] customers = {1,2,3,4,5};
        int[] grumpy = {1,1,1,1,1};
        int minutes=3;
        KimbusInterview1 kimbusInterview1=new KimbusInterview1();
        System.out.println(kimbusInterview1.maxCustomers(customers,grumpy,minutes));
    }

    public int maxCustomers(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfied = 0;
        int unsatisfied = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            } else {
                unsatisfied += customers[i];
            }
        }

        int maxUnsatisfied = 0;
        int runningUnsatisfied = 0;

        for (int i = 0; i < n; i++) {
            if (i >= minutes) {
                runningUnsatisfied -= customers[i - minutes] * grumpy[i - minutes];
            }
            runningUnsatisfied += customers[i] * grumpy[i];
            maxUnsatisfied = Math.max(maxUnsatisfied, runningUnsatisfied);
        }

        // Return the total number of satisfied customers
        return satisfied + maxUnsatisfied;
    }


}
