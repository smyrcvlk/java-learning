package OCT_27_19;

public class task6 {
    public static void main(String[] args) {
//ex:
// part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 1 + 3 = 4
        // 1 + 4 = 5
        // 1 + 5 = 6
        // 1 + 6 = 7
        // 1 + 7 = 8
        // 1 + 8 = 9
        // 1 + 9 = 10
        // 1 + 10 = 11
        for (int k = 1; k <= 10; k++) {
            System.out.println("========");
            for (int i = 0; i <= 10; i++) {


                System.out.println(i + " + " + k + " = " + (i + k));

            }

        }
    }

}