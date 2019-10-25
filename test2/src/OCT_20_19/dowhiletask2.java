package OCT_20_19;

import java.util.Scanner;

public class dowhiletask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pin;
        do {
            System.out.println("please enter your password");
            pin = scan.nextLine();

            if(pin.length()!= 4){
                    //123=>999
                    //1233=>10000
                    System.out.println("please only have 4 letters");

            }

        } while (!"hiii".equalsIgnoreCase(pin));

        System.out.println("correct pin");

    }
}
