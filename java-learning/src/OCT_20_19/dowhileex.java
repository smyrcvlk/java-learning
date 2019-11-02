package OCT_20_19;

import java.util.Scanner;

public class dowhileex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin = 0;
        do {
            System.out.println("WRITE YOUR PIN:");
            pin = scan.nextInt();
        }while (pin != 9999);


        System.out.println("Take you card");
    }
}

