package officehours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {



        /*
         * 1.Create list of Integers 2.Ask 5 integer from user and store into int type
         * using scanner 3.then add each number if it is even number
         */

        public static void main(String[] args) {

            List<Integer> numEven = new ArrayList<>();
            List<Integer> numOdd = new ArrayList<>();


            //List<Integer> num1 = new ArrayList<Integer>();
            //ArrayList<Integer> num3 = new ArrayList<>();

            Scanner scan = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Lutfen sayi giriniz : ");
                int nums = scan.nextInt();
                if (nums % 2 == 0) {
                    numEven.add(nums);
                }else {
                    numOdd.add(nums);
                }
            }

            System.out.println(numEven);
            System.out.println(numOdd);

            // int Integer
            // float Float
            // char Character
        }



}
