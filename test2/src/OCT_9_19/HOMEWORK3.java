package OCT_9_19;

public class HOMEWORK3 {
    public static void main(String[] args)
    {
        int num1 = 30;
        int num2 = 5;


        add (num1,num2);
        multiply (num1,num2);
        deduct(num1,num2);
        divide (num1,num2);
    }

    private static void add(int num1, int num2) {
        System.out.println(num1 + num2);

    }
    private static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void deduct(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void divide(int num1, int num2) {
        System.out.println(num1 / num2);

    }
    }
