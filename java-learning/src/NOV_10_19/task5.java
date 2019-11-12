package NOV_10_19;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        // Write a Java program to find the second largest element in an array.
        // {1, 34, 66, 1000, 23, 4, 7, 9} => 66
//           int []num={1, 34, 66, 1000, 23, 4, 7, 9};
//
//        for(int i=0; i<num.length;i++) {
//
//            Arrays.sort(num);
//
//            System.out.println(num[i]);
//        }
//
//        int max2=num[num.length-2];
//        System.out.println(max2);

        int[] nums = {1, 1000, 34, 66};

        Arrays.sort(nums);
        System.out.println("second largest "+ nums[nums.length-2]);

        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxSecond = num;
            }
        }
        System.out.println("Max:" + maxFirst);
        System.out.println("Max2:" + maxSecond);


    }

}

