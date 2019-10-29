package OCT_28_19;

public class arraysboolean {
    public static void main(String[] args) {
        boolean haveFive = false;
        for (int i = 6; i < 10; i++) {
            if (i == 5) {
                haveFive = true;
            }
        }

        if(haveFive) {
            System.out.println("you have 5 in array");
        }else {
            System.out.println("you dont have");

        }   }
}
