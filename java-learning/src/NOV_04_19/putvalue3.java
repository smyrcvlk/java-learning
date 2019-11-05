package NOV_04_19;

import java.util.HashMap;

public class putvalue3 {
    public static void main(String[] args) {


        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        //write you code here
       // for (int i = 0; i < lastNames.length; i++) {
          //  System.out.println(firstNames[i] + "=" + lastNames[i]);


            HashMap<String, String> people = new HashMap<>();
            for (int i = 0; i < 3; i++) {// 0 1 2
//            System.out.print(firstNames[i] + "=" + lastNames[i]);
                String key = firstNames[i];
                String value = lastNames[i];
                people.put(key, value);
            }

            System.out.println(people);
            //output:
            //{Max=Smith, Drake=Jones, Susan=Miller}

        }
    }
//}


