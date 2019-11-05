package NOV_03_19;

import java.util.HashMap;

public class hashmaptask18 {
    public static void main(String[] args) {
        //17. Given map, update the values
        // Apple 333
        // Lemon 444

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println(map);
        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);

        //part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500
        if (map.containsKey("Apple")) {
            map.put("Apple", 500);
            System.out.println( map);

        }
    }

}
