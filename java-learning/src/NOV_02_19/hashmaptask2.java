package NOV_02_19;

import java.util.HashMap;

public class hashmaptask2 {
    public static void main(String[] args) {

        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        System.out.println("Size of the hash map: "+hash_map.size());
    }


}
