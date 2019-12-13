package DEC_01_19;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Multiplier {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }


    static int multiply(List<Integer> numbers) {
        int multiply = 1;
        for (Integer number : numbers) {
            multiply *= number;
        }
        return multiply;
    }

    @Test
    public void multiplyTwoIntegers() {
        int actual = multiply(2, 2);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyThreeIntegers() {
        int actual = multiply(2, 2, 2);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyListIntegers() {
        int actual = multiply(Arrays.asList(1, 2, 3));
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTwoDoubles() {
        double actual = multiply(2.0, 2.0);
        double expected = 4.0;


        Assert.assertEquals(expected, actual, 1);
    }



//    public static void main(String[] args) {
//        int r2 = multiply(1, 2);
//        System.out.println(r2);
//
//        int r3 = multiply(1, 2, 3);
//        System.out.println(r3);
//
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int r5 = multiply(list);
//        System.out.println(r5);
//    }
}
