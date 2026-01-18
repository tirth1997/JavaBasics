package VeryEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz obj =new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<String> valueResult=obj.fizzBuzz(a);
        System.out.println(valueResult.toString());
    }
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=1;i<=A;i++){
            if(i%5==0 && i%3==0){
                result.add("Fizz");
            }
            else if(i%5==0){
                result.add("Buzz");

            }
            else if(i%3==0){
                result.add("FizzBuzz");

            }
            else{
                result.add(String.valueOf(i));

            }
        }
        return result;
    }
}
