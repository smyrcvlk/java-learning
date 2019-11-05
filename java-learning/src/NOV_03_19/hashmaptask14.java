package NOV_03_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask14 {

    // Apple Lemon Peach Melon Berry
    // 100 200 150 145 250
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();

            System.out.print(name +"  ");
            System.out.print(" ");

        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer point = entry.getValue();

            System.out.print(point + "  ");
            System.out.print(" ");


        } System.out.print(" ");
    }
}


