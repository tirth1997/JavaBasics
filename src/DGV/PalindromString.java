package DGV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromString {
//Practive Diamind pattern
    public static void main(String[] args){
        List<String> input=new ArrayList<>();
        boolean isPlindrom=true;
        input= Arrays.asList("a","b","b","a");
        if(input.size()%2 ==0){
            int sizeOfHalf = (input.size())/2;
            for(int i =0 ;i<(sizeOfHalf);i++){
                if(!input.get(i).equals(input.get(input.size()-1-i))){
                    isPlindrom=false;
                    break;
                }
            }
        }else {
            int sizeOfHalf = (input.size()+1)/2;
            for(int i =0 ;i<(sizeOfHalf-1);i++){
                if(!input.get(i).equals(input.get(input.size()-1-i))){
                    isPlindrom=false;
                    break;
                }
            }

        }

        if(isPlindrom){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
