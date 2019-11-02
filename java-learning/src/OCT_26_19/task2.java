package OCT_26_19;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
//        arr[0] = scan.nextInt();
//        arr[1] = scan.nextInt();
//        arr[2] = scan.nextInt();
//        arr[3] = scan.nextInt();
//        arr[4] = scan.nextInt();
//        arr[5] = scan.nextInt();
//        arr[6] = scan.nextInt();
//        arr[7] = scan.nextInt();
//        arr[8] = scan.nextInt();
//        arr[9] = scan.nextInt();


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Provide number " + i);
//            arr[i] = scan.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);

            System.out.println("-------------------------");

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println("Provide number " + i);
                arr[i] = scan.nextInt();
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }


        }

    }



