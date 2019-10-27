package OCT_27_19;

public class task4 {
    public static void main(String[] args) {
        // part1.1 continue part1, but use multiplication(*) and 2 variables,
        //  a = 1; b = 1;
        //  result = a * b;
        // print => a + "*" + b + "=" + result;

        //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10


        for (int k = 1; k <= 10; k++) {
            System.out.println("===");
            for (int i = 0; i <= 10; i++) {


                System.out.println(i + " x " + k + " = " + (i * k));
            }
        }
    }

}