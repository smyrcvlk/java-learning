package OCT_20_19;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTASK {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess a Number game!!!");
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // 0 -> 10

        Scanner scan = new Scanner(System.in);
        System.out.println("hey, how many time you wanna try?");
        int numberoftry=scan.nextInt();
        System.out.println("you chose "  + numberoftry);
        int myNumber = -1;
        int counter = 1;
        while (true) {
            System.out.println("Provide number");
            myNumber = scan.nextInt();

            if (myNumber < randomNumber) {
                System.out.println("Provide a greater number");
            } else if (myNumber > randomNumber) {
                System.out.println("Provide a smaller number");
            } else if (myNumber == randomNumber) {

                System.out.println("You win the game");
                break;
            }

            if (counter == numberoftry) {
                System.out.println("you failed to guess a number, sorry, better luck next time");
                break;
            }

            counter++;
        }

        System.out.println("Number was " + randomNumber);
    }
}