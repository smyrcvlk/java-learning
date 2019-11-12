package NOV_10_19;

import java.util.ArrayList;
import java.util.HashSet;

public class task7 {
    public static void main(String[] args) {
        // Given arrayList of chars
        // print true if they have repetitive letters
        // {'A','B','B'} => true
        // {'C','D'} => false
        char [] str = {'A','B','B'};

        boolean rep = false;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    rep = true;
                }
            }
        }
        if (rep) {
            System.out.println("they have repetitive letters");
        } else {
            System.out.println("they haven't repetitive letters");
        }
        ArrayList<Character> letterList = new ArrayList<>();
        letterList.add('C');
//        letterList.add('D');
//        letterList.add('e');
//        letterList.add('D');
//        letterList.add('B');

        // 1way. sets
        HashSet<Character> letterSet = new HashSet<>();
        for (Character letter : letterList) {
            letterSet.add(letter);
        }

        System.out.println(letterList);
        System.out.println(letterSet);
        if(letterList.size() == letterSet.size()){
            System.out.println("we dont have repetition: " + false);
        }else {
            System.out.println("we have repetition: " + true);
        }

        // 2way. nested loop
        // 3way. indexes
    }
}
