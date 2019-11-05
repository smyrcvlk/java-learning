package NOV_03_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask1 {
    public static void main(String[] args) {
        //1. Write a Java program to associate the specified value with the specified key in a HashMap.

        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        for(Map.Entry x:hash_map.entrySet()){

            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
