package Encryption;

import javax.xml.bind.DatatypeConverter;

public class Encyption {


    public static void main(String[] args){
        String authorizationHeader = "Basic "
                + DatatypeConverter.printBase64Binary(("ecommerce:Ecom@123").getBytes());

        String authorizationHeader1 = "Basic "
                + DatatypeConverter.printBase64Binary(("ecommerce:Ecom@123").getBytes());

        System.out.println(authorizationHeader);
        System.out.println(authorizationHeader1);


    }

}
