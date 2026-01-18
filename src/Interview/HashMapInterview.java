package Interview;

import java.util.HashMap;
// No Dulpicate keys value against duplicate key
public class HashMapInterview {

    public static void main(String[] a){

        HashMap<String,String> map = new HashMap<>();

        map.put("A","a");
        map.put("A","A");

        System.out.println(map);
    }

}
