package OCT_29_19;

import java.util.Arrays;
public class bianarytask1 {
    public static void main(String[] args) {


        int arr[] = {4, 5, 8, 3, 9, 1, 2, 6};
        int target = 8;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int result = Arrays.binarySearch(arr, target);
        while (left <= right) {
            int mid = left + (right - left) / 2;

            var value = arr[mid];
            if (value == target)
               // return mid;
                //
                System.out.println("Element found at "+ "index " +result );


            if (value < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        // if we reach here, then element was not present
       // return -1;
        System.out.println("element found " +result );


    }

}