package OCT_28_19;

import java.util.Random;

public class arrayshw {
    public static void main(String[] args) {

        //TODO Task
        // 1. Return the number of even ints in the given array.
        // {1,2,3,4,5,6} => 3
        // Hint: you need to count "even numbers"

        Random rand = new Random();

        int[] arr = new int[10];
        int evenCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }

        for (int n : arr) {
            System.out.println("  it is an number " + n);
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCounter++;
            }
        }

        System.out.println("you have " + evenCounter + " even numbers");

    }
}
