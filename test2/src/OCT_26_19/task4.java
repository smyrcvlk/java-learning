package OCT_26_19;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[5];
        for (int num = 0; num < array.length; num++) {
            array[num] = (int) (Math.random() * 20);
            // array[num] = rand.nextInt(100);
            System.out.println(array[num]);
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                System.out.println("Zero is in the array: " + array[i] );
            }else if(array[i]==10){
                System.out.println("ten is in the array;" + array[i]);

            } else if (array[i]==0 && array[i]==10 ) {

            }
        }
    }
}