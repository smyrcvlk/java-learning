package NOV_01_19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSetEx1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }

        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(1);
        listNumbers.add(1);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(1);
        setNumbers.add(1);
        System.out.println(setNumbers);
    }
}






