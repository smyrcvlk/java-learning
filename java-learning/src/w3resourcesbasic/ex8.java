package w3resourcesbasic;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
       // Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
        Scanner scan= new Scanner(System.in);
        System.out.println("input your number;");

        int n= scan.nextInt();
         if (n%2==0){
             System.out.println("1");
         }else
             {
             System.out.println("0");
         }
    }
}
