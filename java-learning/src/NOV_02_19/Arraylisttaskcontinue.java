package NOV_02_19;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylisttaskcontinue {
    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList();

        letters.add("D");
        letters.add("C");
        letters.add("A");
        letters.add("B");

        //8. Write a Java program to sort a given array list.
        System.out.println("List before sort: "+letters);
        Collections.sort(letters);
        System.out.println("List after sort: "+letters);
        //9. Write a Java program to copy one array list into another.
        System.out.println("task 9====================");


    }
}
