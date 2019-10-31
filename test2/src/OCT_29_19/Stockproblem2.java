package OCT_29_19;

public class Stockproblem2 {
    public static void main(String[] args) {


//    Best Time to Buy and Sell Stock II
//    Say you have an array for which the ith element is the price of a given stock on day i.
//    Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

//    Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

//    Example 1:

//   Input: [7,1,5,3,6,4]

//    Output: 7

//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.

//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

//    Output: 4
//    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//    Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//    engaging multiple transactions at the same time. You must sell before buying again.
//    Example 3:
//
//    Input: [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transaction is done, i.e. max profit = 0.

//        int[] prices = new int[]{7, 6, 4, 3, 1};

        //int min = prices[0];//pick any number inside the array
//        int min = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int p : prices) {
//            min = Math.min(min, p);
//            int profit = p - min;
//            maxProfit = Math.max(maxProfit, profit);
//        }
//        System.out.println(maxProfit);

        int [] items= { 7,6,4, 3, 1};
        int profit=0;


        for (int i=0; i<items.length-1;i++) {
            if(items[i+1]>items[i]) {



                profit+=(items[i+1]-items[i]);
            }
        }
        System.out.println(profit);
    }



}
