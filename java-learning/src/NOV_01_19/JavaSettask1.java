package NOV_01_19;

import java.util.HashSet;

public class JavaSettask1 {
    public static void main(String[] args) {
        //1. write a java program to append the specified
        // element to the end of a hash set.
        // ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]

        HashSet<Integer> setNumbers = new HashSet<Integer>();

        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);

        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);

        System.out.println("The Hash Set: " + setNumbers);


        }
}
