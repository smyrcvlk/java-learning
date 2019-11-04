package NOV_02_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask8 {
    public static void main(String[] args) {
        //8. Write a Java program to test if a
        //   map contains a mapping for the specified value.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Lemon");
        map.put(3, "Peach");
        map.put(4, "Avocado");
        map.put(5, "Pineapple");

        System.out.println("map 1: " + map);
        // if map has value as "Black", print => 3 <- key
        String value = "Peach";
        if (map.containsValue(value)) {
            System.out.println("It has Peach");
        } else {
            System.out.println("it has not");
        }

        System.out.println("Part2---------------------------------------------");
        //part2, try to check it using loop, without .containsValue method
        //       print key if you have value in map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer entryKey = entry.getKey();
            String entryValue = entry.getValue();

            if (entryValue.equals("Pineapple")) {
                System.out.println("key is:" + entryKey);
            }
        }

            boolean hasPineapple = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer entryKey = entry.getKey();
            String entryValue = entry.getValue();

            if (entryValue.equals("Pineapple")) {
                hasPineapple = true;
            }
        }

        if(hasPineapple){
            System.out.println("has it");
        }else {
            System.out.println("dont have");
        }

    }
}










