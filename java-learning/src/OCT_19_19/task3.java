package OCT_19_19;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("provide a  max number");
        int max=scan.nextInt();
        int sum=0;
        int c=0;

        for(int i=0; i<=max; i++){
            System.out.println(i);

            sum +=i;
            c++;

            System.out.println("sum is:  " + sum);
            System.out.println("average is:  "+ (double) sum/c);

        }




    }
}
