package NOV_02_19;

import java.util.ArrayList;
import java.util.Collections;

public class task9 {
    public static void main(String[] args) {
        //9. Write a Java program to copy one array list into another.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");

        System.out.println("List 1: "+ list1);

        ArrayList<String> list2 = new ArrayList<>(list1);
        // write code here
        Collections.copy(list1,list2);

        // end of code
        System.out.println("List 2: "+ list2);


    }
}
