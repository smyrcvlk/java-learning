package NOV_09_19;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        //1. Write a Java program to sort in reverse order a numeric array .
        int[] numbers = {1, 2, 4, 10, 2, 0};

        for (int n : numbers) {
            System.out.print(n + " ");
        }


        System.out.println("=========");
        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");



        }
        System.out.println("=========");


        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print( numbers[i] + " ");
        }

//        int[] numbers = {3, 5, 10, 1};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        for(int i = numbers.length-1; i>=0; i--){
//            System.out.print(numbers[i]+" ");
//        }
//
//        //part2, copy reverse ordered array to new array;
//        int[] reversedNumbers = new int[numbers.length];
//        System.out.println(Arrays.toString(reversedNumbers));
//        //output should be [10, 5, 3, 1]


    }

}