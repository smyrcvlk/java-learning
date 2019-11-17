package w3resources;

import java.util.Scanner;

public class methods2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();

        double average = (x + y + z) / 3;

        System.out.print("The average value is " + average);

    }
        public static double average(double x, double y, double z)
        {
            return (x + y + z) / 3;
    }
}
