package NOV_03_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask3 {
    public static void main(String[] args) {
           //3. Write a Java program to copy all of the
        //   mappings from the specified map to another map.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("map 1: " + map);
        HashMap<Integer, String> map2 = new HashMap<>();
//        System.out.println("1. way");
//        map2 = new HashMap<>(map);

//        System.out.println("2. way with .putAll method");
//        map2.putAll(map);

        System.out.println("3. way with loop");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            //Hint: use .put method
            map2.put(key, value);
        }
        System.out.println("map 2: " + map2);
    }
}

