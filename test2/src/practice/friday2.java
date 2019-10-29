package practice;

import java.util.Arrays;

public class friday2 {
    public static void main(String[] args) {
        // part1. fill array with random values using Random/Math.random, 10 < array.length < 100
        // part2. find average or array;
        //  ex: [1, 5, 6, 8] => 20/4 => 5

        int[] numbers = new int[20];

        for(int i = 0; i< numbers.length; i++)
        {
            numbers[i] = 1 + (int) (Math.random() * (100));
        }
        System.out.println(numbers.length);
     //   System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
        {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);


    }
}
