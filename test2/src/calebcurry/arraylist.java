package calebcurry;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer>grades= new LinkedList<Integer>();
        grades.add(5);
        grades.add(10);
        grades.add(1,7);
        System.out.println(grades.get(0));
        System.out.println(grades.get(1));
        System.out.println(grades.get(2));
        System.out.println(grades.contains(7));
         //grades.isEmpty()
        System.out.println(grades.get(0));

       // grades.clear();


    }
}
