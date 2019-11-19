package officehours;

import java.util.Random;

public class method {

    //    public means we can access to this method in all the project --> protector , default , private

//    void -> we dont havve a return type
    /*
        I live in ohio cincinnati

        i
        live
        in
        ohio
        cincinnati

        live


     */

//    method1 --> is a method name(it could be anything better to have a meaningfull name)

/*
    parameter --->  we could have multiple parameters

    when i call this method which values or data I would like to use in my method

 */

    //   take string and split it return number of word   ----->>>   I am living in the United Steates
//
//
//   return --->>  7
    public static int method1(String str1) {

        String[] str1Char = str1.split(" ");

        int ArrayLenght = str1Char.length;

        return ArrayLenght;
    }

    public static void main(String[] args) {

        String str1 = "I am using Apple and its fine";
        int srt1WordCount = method1(str1);
        System.out.println("srt1WordCount -->>  " + srt1WordCount);

        String str2 = "I am working in the united states, and living here for a while";
        int srt2WordCount = method1(str2);
        System.out.println("srt2WordCount -->>  " + srt2WordCount);


    }
//    name is RadnomGenrator
//    This method taking a number(int) as parameter  and return the int Creating random number
//
//    Create one method name os reverseString
//    This method takign a String as parameter and returning the String as a parameter and reverse_string
//
//    Create one method name is CheckPalindrome
//    This method return type boolean taking two string and verifying those are equal check the palindrome

    public int RandomGenerator(int max) {
        Random rnd = new Random();
        int myrnd = rnd.nextInt(max);
        return myrnd;
    }

    public String reverseString(String s2) {
        String reverse = "";
        char[] strarray = s2.toCharArray();
        for (int i = strarray.length - 1; i >= 0; i--) {
            reverse = reverse + strarray[i];

        }
        return reverse;

    }

    public boolean CheckPalindrome(String s1, String s2) {

        boolean b1 = s1.equals(s2);

        return b1;

    }
}