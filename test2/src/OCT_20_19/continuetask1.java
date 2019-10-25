package OCT_20_19;

public class continuetask1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println("start of iteration" +i);

            if (i % 2 == 0)
                continue;
            else {
                System.out.println("end of iteration" +i );

            }
        }

    }
}