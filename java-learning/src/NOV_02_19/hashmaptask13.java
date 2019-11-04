package NOV_02_19;

import java.util.HashMap;
import java.util.Map;

public class hashmaptask13 {
    //13. calculate sum of items,
    //  size of map should be at least 5
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Banana", 300);
        map.put("Cherry", 400);
        map.put("Pineapple", 500);

        int sum = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();



        }System.out.println("Sum items " + sum);

//        int sum = 0;
//        for(Map.Entry<String, Integer> e : map.entrySet()){
//            int price = e.getValue();
//
//            sum += price;// sum = sum + price;
//        }
//
//
//        System.out.println("Sum items: " + sum);
    }



}