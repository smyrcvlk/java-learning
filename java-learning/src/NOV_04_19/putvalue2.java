package NOV_04_19;

import java.util.HashMap;

public class putvalue2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] names = {"Max", "Drake", "Susan"};

        //write you code here
        for (String name : names){
            map.put(name, 0);

        } System.out.print(map);

        //end of you code
//        System.out.println(map);
        //output:
        //{"Max"=0,"Drake"=0,"Susan"=0}
    }

}
