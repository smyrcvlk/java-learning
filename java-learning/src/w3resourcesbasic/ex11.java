package w3resourcesbasic;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        //Write a Java program to reverse a word.

//        Scanner in = new Scanner(System.in);
//        System.out.print("\nInput a word: ");
//        String word = in.nextLine();
//        word = word.trim();
//        String result = "";
//        char[] ch=word.toCharArray();
//        for (int i = ch.length - 1; i >= 0; i--) {
//            result += ch[i];
//        }
//        System.out.println("Reverse word: "+result.trim());
        String result="";
        String str= "sumeyra";
        char [] ch= str.toCharArray();
        for (int i = ch.length-1; i>=0 ; i--) {
            result+=ch[i];


        }
        System.out.println("reverse word : " + result.trim());
    }
}
