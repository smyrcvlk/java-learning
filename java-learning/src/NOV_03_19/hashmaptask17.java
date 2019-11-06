package NOV_03_19;

import java.util.HashMap;
import java.util.HashSet;

public class hashmaptask17 {
    public static void main(String[] args) {
        //17. count Character in string
        // " BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"

        //part 1
        // print every character in separate line
        //part2
        // put every character in HashSet
        //part3
        // put every character in HashMap<Character, Integer>
        //part4
        // when you are putting check if you have that letter already, if you have, increment value
        //part5
        //print HashMap

        String str = "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!";
      //  System.out.print("\n" + str);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (Character.isLetter(str.charAt(i)))
                counter++;

        }
        System.out.println(counter + " letters.");
        System.out.println("part 2======================");

        HashMap<Character,Integer> map= new HashMap<>();

        String s =" BECOME A SOFTWARE TESTER IN 6 MONTHS";

        for (int i = 0; i <s.length(); i++) {
            char aChar= s.charAt(i);


        }
        System.out.println(map);

        char [] c=s.toCharArray();

        for(int i=0; i<c.length;i++) {


            System.out.println(s.charAt(i));

        }

        System.out.println("part 3=========================");

        HashSet<Character> myset = new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            char aChar= s.charAt(i);
            myset.add(aChar);

        }
        System.out.println(myset);



        System.out.println("part 4========================");




    }

}
