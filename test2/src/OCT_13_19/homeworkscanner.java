package OCT_13_19;

import java.util.Scanner;

public class homeworkscanner {
    public static void main(String[] args) {
        //  1. write a program that prints word representation of your number
//      where number is 0 <= N <= 3
// ex: 0 => zero
// ex: 3 => three

// HW:2. write a program that prints number of word representation number
//     where number is 0 <= N <= 3
// ex: zero => 0
//     one => 1
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();

        if ("zero".equalsIgnoreCase(s1)) {
            System.out.println(0);
        }
        if (s1.equals("one")) {
            System.out.println(1);
        }
        if (s1.equals("two")) {
            System.out.println(2);
        }
        if (s1.equals("three")) {
            System.out.println(3);


        }
    }
}