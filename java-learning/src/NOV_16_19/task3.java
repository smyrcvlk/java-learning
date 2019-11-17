package NOV_16_19;

import java.util.ArrayList;

public class task3 {
    // Write a program with a method named printAverage
    // that accepts ArrayList of integers as an argument and print its average.
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(4);
        firstList.add(90);
        firstList.add(10);
        firstList.add(5);

        printavarage(firstList);
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);

        printavarage(myList);


    }
    public static void printavarage(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        double avg=(double) sum/list.size();
        System.out.println("average is:" + avg);




    }

}
