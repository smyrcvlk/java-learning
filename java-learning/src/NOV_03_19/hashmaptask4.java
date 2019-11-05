package NOV_03_19;

import java.util.HashMap;

public class hashmaptask4 {
    public static void main(String[] args) {
        // 4. Write a Java program to remove all of the mappings from a map.


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Size of map is: " + map.size());
         map.clear();
        System.out.println("The size of map is : " + map.size());
    }

}




