package OCT_26_19;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        //TODO Task
        // part1. fill array with random values using Random/Math.random,
        //        where length of array is 10 <= array.length <= 100
        // part2. find average of array;
        //  ex: [1, 5, 6, 8] => 20/4 => 5
//        Random rand=new Random();
//        int[] numbers = new int[20];
//
//        for(int i = 0; i< numbers.length; i++)
//        {
//            numbers[i] = 1 + (int) (Math.random() * (100));
//        }
//        System.out.println(numbers.length);
//
//
//        int sum = 0;
//        for(int i=0; i < numbers.length ; i++)
//        {
//            sum += numbers[i];
//        }
//        double average = sum / numbers.length;
//        System.out.println("Average value of the array elements is : " + average);
//// array.fori + enter will give you for (int i = 0; i < arr1.length; i++) {


Random rand = new Random();
        // part1.
        // create array with size 10 <= size <= 100
        // use loop to get access for every element i n array
        // use rand.nextInt(1000) to assign random number to every element in array
        int[] arr = new int[10];
        // type variable name, press dot, select fori form popup,
        // to create for with shortcut
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            arr[i] =  (int) (Math.random() * 100);
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;
        System.out.println("\nAvg: " + avg);
    }
}




