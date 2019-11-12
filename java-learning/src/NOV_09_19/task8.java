package NOV_09_19;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        // Write a java program which will
        // add only even numbers to list from array of integers
        // {100,2,4,5,6,7,8,9,10}
        // [2,4,6,8,10]

        // hint: num%2==0 => this is even
        int[] numbers = {100,2,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> number = new ArrayList<Integer>();

//        System.out.println(number);
//        for (int i : numbers) {
//            number.add(i);
//
//            if(numbers[i]%2==0);
//            number.add(numbers[i]);
//        }

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                number.add(i);
            }
        }

        System.out.println(number);
    }

}
