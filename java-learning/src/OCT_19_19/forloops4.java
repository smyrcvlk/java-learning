package OCT_19_19;

import java.sql.SQLOutput;
import java.util.Scanner;

public class forloops4 {
    public static void main(String[] args) {
        // Part2. Continue Part1, but use scanner to provide maximum loop iteration
        // instead of 10 in part1, you should use provided number.

        // Part3. Continue part2, but also provide starting number;

            //part 1
//        for(int i = 0; i < 10; i++){
//            if( i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------------------");

            //part 2
          System.out.println("provide min number: ");

          Scanner scan = new Scanner(System.in);
          int min = scan.nextInt();
          System.out.println("Provide max number: ");
//
            int max = scan.nextInt();
            for(int i = 0; i <= max; i++){
                if( i % 2 == 0){
                    System.out.println(i);
               }
           }
//            System.out.println("----------------------------------");



        }
}
