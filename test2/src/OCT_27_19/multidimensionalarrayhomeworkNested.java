package OCT_27_19;

public class multidimensionalarrayhomeworkNested {
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

        int columnLength = price[0].length;
        for (int column = 0; column < columnLength; column++) {
            int sum = 0;
            for (int row = 0; row < price.length; row++) {
                sum += price[row][column];
            }
            System.out.println(" Market " + (column + 1) + " sum: " + sum);
        }

        System.out.println();

        System.out.println("Part 2");
        System.out.println("====================");

        for (int row = 0; row < price.length; row++) {
            int sum = 0;
            for (int col = 0; col < price[row].length; col++) {
                sum += price[row][col];
            }
            double avg = (double) sum / price[3].length;
            System.out.println(" Product " + (row + 1) + " avg: " + avg);
        }


//        Part 1
//        ====================
//        Market 1 sum: 11
//        Market 2 sum: 13
//        Market 3 sum: 14
//
//        Part 2
//        ====================
//        Product 1 avg: 4.0
//        Product 2 avg: 3.0
//        Product 3 avg: 4.333333333333333
//        Product 4 avg: 1.3333333333333333
//
//        Process finished with exit code 0
        int[][] prices = {
                {3, 4, 5},
                {3, 3, 3},
                {4, 5, 4},
                {1, 1, 2}
        };


        for (int i = 0; i < prices.length; i++) {
            int sum = 0;
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
                sum += prices[i][j]; // sum = sum + prices[i][j];
            }
            double avg = (double) sum / prices[i].length;
            System.out.print("\nSum is: " + sum);
            System.out.print("\nAvg is: " + avg);

            System.out.println();

        }

    }

}