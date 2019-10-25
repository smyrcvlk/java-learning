package OCT_20_19;

public class continueex4 {
    public static void main(String[] args) {
        //write a program that iterates from 0 to 10
        // but only prints numbers which
        // are greater than 4 and less than 8
        // you MUST use continue


        for (int i = 0; i <= 10; i++) {
            if (i > 4 && i < 8) {
                System.out.println("number is " + i);
                continue;
            }

        }


    }


}