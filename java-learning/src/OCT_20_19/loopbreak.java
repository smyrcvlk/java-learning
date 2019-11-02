package OCT_20_19;



public class loopbreak {
    public static void main(String[] args) {
        int number=0;
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                number= i;
                break;
            }
        }
        System.out.println("your number is: " + number);
    }



}
