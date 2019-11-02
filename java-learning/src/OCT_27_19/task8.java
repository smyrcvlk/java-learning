package OCT_27_19;

public class task8 {
    public static void main(String[] args) {

        //TODO Write program that prints this using loops
        //     *
        //
        //   ***
        //  ****
        // *****

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j >= i) {
                    System.out.print(" *");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}