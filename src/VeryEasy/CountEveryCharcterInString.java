package VeryEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class CountEveryCharcterInString {

    public static void main(String[] args){
        CountEveryCharcterInString countEveryCharcterInString=new CountEveryCharcterInString();
        String inputString= "abcdefghijklasdmnopqrstuvwxyz";
        ArrayList<Integer> integers =countEveryCharcterInString.solve(inputString);
        System.out.println(integers);
    }

    public ArrayList<Integer> solve(String A) {

        int[] count = new int[26];

        for(int i =0;i<A.length();i++)

        {

            char ch = A.charAt(i);

            int value = ch - 97;

            count[value]++;

        }
        ArrayList<Integer> result =  new ArrayList<Integer>();

        for(int j=0;j<26;j++){
            result.add(count[j]);
        }

        return result;

    }
//    public ArrayList<Integer> getRowEfficient(int A) {
//
//        ArrayList<Integer> kThRow=new ArrayList<>();
//        int prev = 1;
//
//        ArrayList<Integer> result =  new ArrayList<Integer>();
//
//        for(int j=0;j<26;j++){
//            result.add(count[j]);
//        }
//
//        return result;
//
//    }
}

