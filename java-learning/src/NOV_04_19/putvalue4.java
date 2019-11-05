package NOV_04_19;

import java.util.HashMap;

public class putvalue4 {
    public static void main(String[] args) {
        // put letters as keys into your HashMap,
        // put value = 0 // constraints: YOU HAVE TO USE IF STATEMENT
        //    //              put value = 0
        //    // HINT: use if statement

        String sentence = "jonny hello asd";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            if(letter == 'h') {
                letterMap.put(letter, 0);
            }
        }

        System.out.println(letterMap);
        // {h=0}
    }


}

