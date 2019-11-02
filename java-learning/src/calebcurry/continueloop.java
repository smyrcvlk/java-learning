package calebcurry;

public class continueloop {
    public static void main(String[] args) {
        for (int i = 9; i >=0; i--) {

            for (int j = i; j >=0 ; j--) {
                if (i == 5) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
