package OCT_27_19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multidimensionalarrayhomework {
    public static void main(String[] args) {
        //         walmart	costco	corrado's	AVG
        //  apple	3	       4	   5	     4
        //   milk	3	       3	   3	     3
        //   meat	4          5	   4	     4.33
        //  bread	1	       1	   2	     1.33
        //  TOTAL	11	      13	   14

        // given table,
        // part1. calculate sum of price in each market(walmart,costco,corrado's)
        // expected output is:
        // Total at Walmart is: ???
        // Total at costco is: ???
        // Total at corrado's is: ???

        // part2. calculate average price of each item(apple, milk, meat, bread)
        // expected output is:
        // average price of apple is: ???
        // average price of milk is: ???
        // average price of meat is: ???
        // average price of bread is: ???
        int[][] price = {
                {3, 4, 5,},
                {3, 3, 3,},
                {4, 5, 4,},
                {1, 1, 2,},
        };

        System.out.println("Part 1");
        System.out.println("====================");
        // walmart
        int walmartTotal = 0;
        for (int row = 0; row < price.length; row++) {
            walmartTotal += price[row][0];
        }
        System.out.println("walmart Total : " + walmartTotal);

        // costco
        int costcoTotal = 0;
        for (int row = 0; row < price.length; row++) {
            costcoTotal += price[row][1];
        }
        System.out.println("costco Total : " + costcoTotal);

        //corrados
        int corradosTotal=0;
        for (int row = 0; row < price.length; row++) {
            corradosTotal += price[row][2];
        }
        System.out.println("corrados Total : " + corradosTotal);

        System.out.println();
        System.out.println("Part 2");
        System.out.println("====================");
        // apple
        int applesum=0;
        for (int colum = 0; colum < price[0].length; colum++) {
           applesum+=price[0][colum];
        }
        double appleavg = (double) applesum / price[0].length;
        System.out.println("Apple avg: " + appleavg);

        // milk
        int milksum = 0;
        for (int colum = 0; colum < price[1].length; colum++) {
            milksum +=price[1][colum];
        }
        double milkavg = (double) milksum  / price[1].length;
        System.out.println("Milk avg: " + milkavg);

        // meat
        int meatsum = 0;
        for (int colum = 0; colum < price[2].length; colum++) {
            meatsum +=price[2][colum];
        }
        double meatavg = (double) meatsum  / price[2].length;
        System.out.println("meat avg: " + meatavg);

        // bread
        int breadsum = 0;
        for (int colum = 0; colum < price[3].length; colum++) {
            breadsum +=price[3][colum];
        }
        double breadavg = (double) breadsum  / price[3].length;
        System.out.println("bread avg: " + breadavg);


//        Part 1
//        ====================
//        walmart Total : 11
//        costco Total : 13
//        corrados Total : 14
//
//        Part 2
//        ====================
//        Apple avg: 4.0
//        Milk avg: 3.0
//        meat avg: 4.333333333333333
//        bread avg: 1.3333333333333333
//
//        Process finished with exit code 0
    }

}