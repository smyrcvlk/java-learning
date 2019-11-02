package OCT_20_19;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //part1
        //end lopp if you failed to guess anumber after 3 try
        //part2
        //if statement
        System.out.println("welcome to guess a number game!!");
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        Scanner scan = new Scanner(System.in);
        int myNumber = -1;
        int counter=1;
        while (myNumber != randomNumber) {
            System.out.println("Provide a number");
            myNumber = scan.nextInt();
            if (myNumber < randomNumber) {
                System.out.println("provide a greater number");
            } else {
                System.out.println("provide a smaller number");
            }

        }

        System.out.println("you win the game");
        System.out.println("number was " + randomNumber);



    }
}
