package NOV_09_19;

import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        //7. Write a Java program to remove a specific element from an arraylist.



        ArrayList<Integer> numbers = new ArrayList<Integer>();
       numbers.add(25);
       numbers.add(14);
       numbers.add(56);
       numbers.add(35);
       numbers.add(77);

        System.out.println(numbers);

        numbers.remove(2);
        System.out.println( numbers);



    }
}
