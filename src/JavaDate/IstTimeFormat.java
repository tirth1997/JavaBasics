package JavaDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class IstTimeFormat {

    public static void main(String[] args){

        IstTimeFormat format =new IstTimeFormat();

        System.out.println("New Date is " +format.getISTActionDate(new Date()));

    }

    private String getISTActionDate(Date updated) {

        String resultString =new String();

            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

            resultString = dateFormat.format(updated).toString();

            return resultString;
    }

}
