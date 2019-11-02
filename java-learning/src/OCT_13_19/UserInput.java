package OCT_13_19;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Welcome " + name + "!!!");

        System.out.println("-----------------------");
        String s1 = scan.nextLine();
        System.out.println("Your text is: " + s1);

        System.out.println("-----------------------");


    }

}
