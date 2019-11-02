package OCT_13_19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {

 //       Scanner sc = new Scanner(System.in);
  //      String s1 = sc.nextLine();
    //    System.out.println("Text is: " + s1);

      //  int i1 = sc.nextInt();
        //System.out.println("Number is: " + i1);

//    Write a program that ask a number
        //example:
        //provide a number:
        //3
        //your number is 3
        Scanner sc= new Scanner(System.in);
        System.out.println("provide a first number:");

        int i1=sc.nextInt();
        System.out.println("Your number first is:" + i1);

        System.out.println("provide a second number:");

        int in2= sc.nextInt();
        System.out.println("your second number is:"+ in2);

        int sum= i1 +in2;

        System.out.println("sum is :");

        System.out.println(i1+in2);

    }
}
