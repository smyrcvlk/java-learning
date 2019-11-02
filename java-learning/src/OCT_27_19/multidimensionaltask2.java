package OCT_27_19;

import java.util.Random;

public class multidimensionaltask2 {
    public static void main(String[] args) {

//TODO Using 2D Array fill the table of exam
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???


        int[][] examResult = {
                {100, 100, 100},
                {100, 100, 100, 100, 100},
                {100, 100, 100, 100, 100},
        };
        //part2
        System.out.println("Length: " + examResult[0].length);
        Random random = new Random();
        for (int row = 0; row < examResult.length; row++) {
            for (int col = 0; col < examResult[row].length; col++) {
                //part2.1
                examResult[row][col] = random.nextInt(100);
                System.out.println(examResult[row][col]);
            }
            System.out.println();
        }



    }

        }
