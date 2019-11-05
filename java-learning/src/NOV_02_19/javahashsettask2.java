package NOV_02_19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class javahashsettask2 {
    public static void main(String[] args) {
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
        for(Integer setnumber : setNumbers){

        }
        System.out.println(setNumbers);

        System.out.println( "2.way===============");
        System.out.println();

        System.out.println("\n2. way ------------------------------");
        Iterator<Integer> iterator = setNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
        System.out.println("task 3================");
        System.out.println(setNumbers.size() );

        System.out.println("task4===================");

        ArrayList<Integer> s2 = new ArrayList<>();
        s2.add(1);
        s2.add(2);
        setNumbers.removeAll(s2);
        System.out.println(setNumbers); //=> [3, 5, 10]

        // Removes from this set all of its elements
        // that are contained in the specified collection
    }


}




