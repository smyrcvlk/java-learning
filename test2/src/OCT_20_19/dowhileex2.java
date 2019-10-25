package OCT_20_19;

import java.util.Scanner;

public class dowhileex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin=0;
        do {
            System.out.println("Write your PIN: ");
            pin = scan.nextInt();
            if( (pin<999) ||(pin>=10000)){
                //123=>999
                //1233=>10000
                System.out.println("wrong combination, please use a 4 digit number");

            }

        } while (pin != 9999);
        System.out.println("Take you card");

//        int pin = 0;
//        do {
//            System.out.println("Write your PIN: ");
//            pin = scan.nextInt();
//
//        } while (pin != 9999);
//        System.out.println("Take you card");

    }//task 1, check pin, pin should be 4 digit number
    // if it is not 4 digit number, print "incorrect pin"
    // hint: 999 < PIN < 10000
    // ex: 13123 => "incorrect pin"


}
