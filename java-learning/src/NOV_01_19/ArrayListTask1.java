package NOV_01_19;

import java.util.ArrayList;

public class ArrayListTask1 {
    public static void main(String[] args) {
        //1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("red");
        arrayList.add("white");
        arrayList.add("black");
        arrayList.add("green");

        // for (String string : arrayList) {

        System.out.print(arrayList + " ");
        System.out.println();

        //2. Write a Java program to iterate through all elements in a array list.

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
        //3. Write a Java program to insert an element into the array list at the first position
        System.out.println(" ----------------");

        System.out.println("Before set");
        for (String string : arrayList) {
            System.out.print(string + " ");
        }
        String firstValueList = arrayList.get(0);
        arrayList.set(0, "Blue");
        System.out.println("\nAfter set");
        for (String string : arrayList) {
            System.out.print(string + " ");
            System.out.println();
        }
        System.out.println("task 4=============");
        System.out.println("\n");
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String element = arrayList.get(0);
        System.out.println("First element: " + element);
        element = arrayList.get(2);
        System.out.println("Third element: " + element);
        System.out.println();
        //5. Write a Java program to update specific array element by given element.
        System.out.println("task 5 ================");
        System.out.println();
        System.out.println(arrayList);
        arrayList.set(2, "blue");
        System.out.println(arrayList);
        System.out.println();
        //6. Write a Java program to remove the third element from a array list.
        System.out.println("task 6  =================");
        System.out.println();
        arrayList.remove(2);
        System.out.println("After removing element from the list:\n" + arrayList);
        System.out.println();
        //7. Write a Java program to search an element in a array list.
        System.out.println("task 7 ==================");
        System.out.println();

        if (arrayList.contains("white")) {

            System.out.println("Found the element");

        } else {
            System.out.println("There is no such element");
        }
        System.out.println();

    }

}


