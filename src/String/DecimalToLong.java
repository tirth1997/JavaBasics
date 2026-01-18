package String;

import java.text.DecimalFormat;

public class DecimalToLong {


    public static void main(String[] args){
        String num="202.00";

        num =new DecimalFormat("#").format(Double.valueOf(num));

        String val = "202.00".replace(".00","");

        Long result_val = Long.valueOf(num);

        System.out.println(result_val);

    }


}
