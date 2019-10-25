package OCT_19_19;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("provide a number:");

        int number=scan.nextInt();
        for(int i=1; i <=10; i++){
            System.out.println(number *i);
        }

    }
}
