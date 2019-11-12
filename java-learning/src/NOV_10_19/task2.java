package NOV_10_19;

public class task2 {
    public static void main(String[] args) {
        // write a java program that find maximum
        // of three numbers
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 + " is the maximum number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 + " is the maximum number.");
        else
            System.out.println( num3 + " is the maximum number.");
    }
}
