package OCT_13_19;

public class mathrandom3 {
    public static void main(String[] args) {

        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

            int min = 10;
            int max = 15;
            int range = max - min;

            int randomInRange = min + (int) (Math.random() * (range + 1));
            System.out.println(randomInRange);

            if(randomInRange==1){
                System.out.println(("one"));

            }

        }
    }
