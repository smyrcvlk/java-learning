package OCT_26_19;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        //TODO Task
        // part1. fill array with random values using Random/Math.random,

        int[] arr = new int[10];
        System.out.println("part1 ---------------------------");

        for (int i = 0; i < arr.length; i++) {
            //part1
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");


        }
        System.out.println("\n part2----------------------   ");
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i]+ " ");

        }     // part2. print it in reverse order
    }
}