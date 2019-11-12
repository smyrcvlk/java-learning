package w3resourcesbasic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24.
//        8 x 10 = 80

        Scanner scan=  new Scanner(System.in);

        System.out.println("write a number");

        int num= scan.nextInt();

        for (int i =8; i <=8 ; i++) {
            for (int j = 0; j <=10 ; j++) {

                System.out.println(i + "x" + j + "=" + i*j);

            }

        }


    }
}
