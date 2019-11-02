package OCT_19_19;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("provide your first number");
        int a = scan.nextInt();
        System.out.println("provide your second number");
        int b = scan.nextInt();

        for (int i =1 ; i<=a; i++) {
            System.out.println(i * b);



        }
    }
}