package OCT_26_19;

import java.util.Random;

public class task4d {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        //part1
        System.out.println("PART 1-----------------------------");
        for (int index = 0; index < randomNumbers.length; index++) {
            randomNumbers[index] = random.nextInt(10);
            System.out.print(randomNumbers[index]+ " ");
        }

        //part2
        System.out.println("\nPART 2-----------------------------");
        for (int index = 0; index < randomNumbers.length; index++) {
            if(randomNumbers[index] == 0){
                System.out.println("it has zero, and index " + index);

            }else if (randomNumbers[index] == 10){
                System.out.println("it has ten, and index " + index) ;
            }
        }

    }
}
