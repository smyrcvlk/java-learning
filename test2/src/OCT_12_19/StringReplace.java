package OCT_12_19;



public class StringReplace {
    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(s1.replace("o", "@"));

        // replace "one with four"

        String s2 = "one two one three";
        System.out.println(s2.replace("one", "four"));

        String s3 = "name;surname;age; grade;class";
        System.out.println(s3.replace(";", " "));

        //task1;
        // write a program that replace your name with your surname
        //ex;Michale=> Jackson

        String s4 = "sumeyra";
        System.out.println(s4.replace("sumeyra", "civelek"));

    }
}
