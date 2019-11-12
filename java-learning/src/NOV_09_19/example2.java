package NOV_09_19;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class example2 {
    public static void main(String[] args) {
        //Write a Java program to sort a numeric array and a string array.

        int[] numbers = {1, 2, 4, 10, 2, 0};
        String[] names = {"zeynep",  "serkan", "bayram"};

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");


        }
        System.out.println();
        System.out.println(" ================");


        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();


        Arrays.sort(names);
        for (String s : names) {
            System.out.print(s + " ");
        }


    }
}