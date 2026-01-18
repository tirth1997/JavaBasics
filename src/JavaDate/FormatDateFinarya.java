package JavaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateFinarya {


    public static void main(String[] args) throws ParseException {
        String startDate="23-MAR-09";
        Date date1=new SimpleDateFormat("yyyy-MMM-dd").parse(startDate);
        System.out.println(date1.toString());
    }
}
