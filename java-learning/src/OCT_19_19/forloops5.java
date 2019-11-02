package OCT_19_19;

import org.w3c.dom.ls.LSOutput;

public class forloops5 {
    public static void main(String[] args) {

//        for (long y = 0, x = 1; x < 5; x++) {
//            System.out.print(x + " ");
//        }
        int N = 0;
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            sum = sum + i;
            N++;
        }

        System.out.println("Sum is :" + sum);
        System.out.println("Average is : " + ((double)sum/N));
    }
}
