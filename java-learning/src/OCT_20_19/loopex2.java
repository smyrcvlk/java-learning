package OCT_20_19;

import java.util.Random;

public class loopex2 {
    public static void main(String[] args) {

        Random rand= new Random();
        int someRandomNumber= rand.nextInt(1000);

        int number=-1;
        for (int i = 0; i <= 10000;  i++) {
            System.out.println(i);
            if (i ==someRandomNumber) {
                System.out.println("----------------");
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);
    }
}

