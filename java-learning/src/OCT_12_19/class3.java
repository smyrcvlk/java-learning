package OCT_12_19;

import java.sql.SQLOutput;

public class class3 {
    public static void main(String[] args) {

        //Concatenating String
        String s1 = "Hello";
        String s2 =" world!!!";

        System.out.println( s1+s2);
        // task 1
        // use separate variable for each word print it in one line
        // using concatenetion
        //ex: "What " , "is" , "your",  "name" "?"=> " What is your name "

        // task2: Continue task 1, but print each word in new line using only one ssout

        String s3= "what ";
        String s4= "is ";
        String s5= "your ";
        String s6= "name ";
        String s7= "?";
        String space=" ";

        System.out.println(s3+space+s4+s5+s6+s7 );
        space ="\n";
        System.out.println(s4 + space + s5 + space + s6 + space + s7);
        System.out.println( "A\nB\nC\nD\nE\nF");

    }
}
