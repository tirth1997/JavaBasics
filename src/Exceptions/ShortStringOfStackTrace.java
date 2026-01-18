package Exceptions;

public class ShortStringOfStackTrace {

    public static void main(String[] s){
        try {
            throw new RuntimeException("Test");
        }catch (Exception e){
            System.out.print("Test Exception "+getShortExceptionString(e,e.getStackTrace().length));
        }
    }
    public static String getShortExceptionString(Exception e, Integer maxLines){
        StackTraceElement[] stackTraceElements = e.getStackTrace();
        StringBuilder builder = new StringBuilder ();
        builder.append(e);
        builder.append("\n");
        for (int i = 0; i < maxLines; i++)
        {
            if(stackTraceElements.length >=i ) {
                builder.append(stackTraceElements[i].toString());
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
