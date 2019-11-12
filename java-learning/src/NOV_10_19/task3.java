package NOV_10_19;

public class task3 {
    public static void main(String[] args) {
        //    Write a Java program to find the largest element in an array.
// {1,34,66,1000,23,4,7,9} => 1000
         int []  arr= {1,34,66,1000,23,4,7,9};
         int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        System.out.println(max);


    }
}