package NOV_04_19;

import java.util.HashMap;

public class concatvalue {
    public static void main(String[] args) {

        // Given map, concatenate map values each time of iteration

        HashMap<String, String> map = new HashMap<>();
        map.put("A", "b");

        for (int i =0; i < 3; i++) {
            System.out.println(map);
            //write you code here
             String value=map.get("A");
             map.put("A", map.get("A") + "b");

            //end of you code
        }
        //output:
        // {"A"="b"}
        // {"A"="bb"}
        // {"A"="bbb"}

    }
}
