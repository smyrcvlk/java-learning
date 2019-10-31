package w3resources;

import java.util.Arrays;

public class arraysremove {
    public static void main(String[] args) {
        //Write a Java program to remove a specific element from an array.

        int[]arr= {1,2,3,4,5};
        System.out.println("original array: " + Arrays.toString(arr) );

        int removeIndex=2;
        for (int i = removeIndex; i < arr.length-1; i++) {
            arr[i]=arr[i+1];

        }
        System.out.println("after removing element : "  + Arrays.toString(arr));

    }//after the removal, the last and second last element in the array will exist twice
}
