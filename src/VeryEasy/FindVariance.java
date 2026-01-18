package VeryEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindVariance {

    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(4);
        integers.add(5);
        integers.add(2);
        FindVariance variance=new FindVariance();
        String result;
        result = variance.solve(integers);
        System.out.println(result);
    }

    public String solve(ArrayList<Integer> A) {
        int sum = A.stream()
                .mapToInt(Integer::intValue)
                .sum();
        double mean = (double) sum / (double) A.size();
        List<Double> squarofMeanMinusElement=new ArrayList<>();
        for(Integer n : A){
            Double valueO = n-mean;
            squarofMeanMinusElement.add(valueO*valueO);
        }
        double sumSquare = squarofMeanMinusElement.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        Double variance = sumSquare/A.size();

        double Bc = A.stream()
                .filter(x-> x<mean).count();

        return String.format("%.2f", variance);
    }
}
