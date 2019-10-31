package w3resources;

import java.util.Arrays;

public class arraysinsert {
    public static void main(String[] args) {
        //Write a Java program to insert an element (specific position) into an array.
        int[] arr={1,2,3,4,5};
        int Indexposition= 2;
        int newvalue=7;
        System.out.println(" original array: "  + Arrays.toString(arr));

        for (int i = arr.length-1; i >Indexposition; i--) {
            arr[i]=arr[i-1];

        }
        arr[Indexposition]=newvalue;
        System.out.println("new array" + Arrays.toString(arr));
    }
}
