package OCT_13_19;

import java.util.Scanner;

public class Userinputtask3 {
    public static void main(String[] args) {

        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInrange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInrange);

        Scanner sc= new Scanner(System.in);



        if (randomInrange <0) {
            System.out.println("negative");
        }
        if (randomInrange >0) {
            System.out.println("positive");

        }
    }
}
