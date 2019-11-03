package NOV_01_19;

import java.util.HashSet;

public class settask3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());

        if(numbers.isEmpty())
        {
            System.out.println("its empty");

        }else{
            System.out.println("numbers in set");


        }

    }




}

