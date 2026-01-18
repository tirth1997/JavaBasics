package PepperMoney;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingOfStringArray {

    public static void main(String[] args){

        String[] inputArray ={"Tirth Tank","Sovit Jain","Maharaj Jain","John Doe", "Ali Khan"};
        List<String> inputList= Arrays.asList(inputArray);
        List<String> sortingFirstName= sortFirstName(inputList);
        System.out.println("Sorting Using First Name =" +sortingFirstName);
        List<String> sortingLastName= sortLastName(inputList);
        System.out.println("Sorting Using Last Name =" +sortingLastName);

    }

    private static List<String> sortLastName(List<String> inputList) {
        Collections.sort(inputList,new Compare());
        return inputList;
    }

    private static List<String> sortFirstName(List<String> inputList) {
        Collections.sort(inputList);
        return inputList;
    }
}

class Compare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
    }
}