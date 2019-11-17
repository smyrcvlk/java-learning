package NOV_16_19;

import org.w3c.dom.ls.LSOutput;

public class JavaMethodWithReturn {
    public static void main(String[] args) {

        int sum = sum(10, 20, 30);
        double average = average(sum, 3);

        System.out.println("sum of three is: " + sum);
        System.out.println("average of three is: " + average);
    }

    public static double average(int sum, int size) {
        double average = (double) sum / size;
        return average;
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }





}





