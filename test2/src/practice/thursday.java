package practice;

import java.util.Scanner;

public class thursday {
    public static void main(String[] args) {
        System.out.println("Enter your grade:");
        //90 +AA
        //80-90 BB
        //70-80 cc
        //700-F

        Scanner s = new Scanner(System.in);

        int i = s.nextInt();



        if (i >= 90) {
            System.out.println("your grade AA");

        } else if
        (i >= 80 && i < 90) {
            System.out.println("your grade BB");

        } else if
        (i >= 70 && i < 80) {
            System.out.println("your grade CC");
        } else {
            System.out.println("your grade F");

        }
    }
}