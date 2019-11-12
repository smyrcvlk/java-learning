package NOV_09_19;

import java.util.ArrayList;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
// Write a Java program to convert an array to ArrayList
        int[] numbers = {1, 2, 4, 10, 2, 0};

        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> number = new ArrayList<Integer>();

        for(int i=0;i<numbers.length;i++) {


            number.add(numbers[i]);
        }
        System.out.println(number);


    }
    //1.way
//        List<String> nameList = Arrays.asList(names);
//        System.out.println(nameList);
//        nameList.remove("yasin");
//        System.out.println(nameList);

//    //2.way
//    ArrayList<String> nameList = new ArrayList<>();
//        System.out.println(nameList);
//        for(String s : names){
//        nameList.add(s);
//    }
//        System.out.println(nameList);
//}

}


