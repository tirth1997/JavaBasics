package Interview;
/*
 *Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
Result String should not have leading zeros.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
"10"
"40"
"50"

in java
 * */
public class AddingInStringWithoutNumberConversion {

    public static void main(String[] args){
        AddingInStringWithoutNumberConversion withoutNumberConversion=new AddingInStringWithoutNumberConversion();

        String result = withoutNumberConversion.addStrings("129","92");

        System.out.println(result);
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString().replaceFirst("^0+", "");
    }
}
