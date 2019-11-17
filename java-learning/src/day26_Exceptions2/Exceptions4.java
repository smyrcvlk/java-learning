package day26_Exceptions2;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) {

        // Filenotfoundexception
//        Scanner input = new Scanner(System.in);
//
//        try {
//            System.out.println("enter you number");
//
//            int number1 = input.nextInt();
//
//            System.out.println("enter second number");
//
//            int number2 = input.nextInt();
//
//            int sum = number1 / number2;
//
//            System.out.println(sum);
//        }
//        catch (Exception ex)
//
//        {
//            System.out.println( "you can not do that" );
//            System.out.println(ex.getStackTrace());
        try {
            File file = new File("c:\\ SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        }
        catch (Exception ex){
            System.out.println("file not found");
            System.out.println(ex.getStackTrace());
        }
        //create a file




    }
}
