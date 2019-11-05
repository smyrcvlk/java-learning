package NOV_04_19;

import java.util.HashMap;

public class incerementvalue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);

        String sentence = "ABC";
        for(char c : sentence.toCharArray()){
            System.out.println(map);

            Integer value=map.get("A");
            map.put("A", value + 1);
            //end of you code
        }
        //output:
        // {"A"=0}
        // {"A"=1}
        // {"A"=2}
    }

}
