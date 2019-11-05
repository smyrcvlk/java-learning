package NOV_03_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask15 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);

        for (Map.Entry<String, Integer> entry : map.entrySet())  {
            String name = entry.getKey();
            Integer point = entry.getValue();
            System.out.println(name + " " + point);
        }
    }

}

