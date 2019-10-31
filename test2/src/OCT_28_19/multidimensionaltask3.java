package OCT_28_19;

public class multidimensionaltask3 {
    public static void main(String[] args) {
        //part1. print
        // apple lemon peach
        // red green blue
// Given string 2D array:
        //part1. you have to USE 2 LOOP and print:
        // apple lemon peach
        // red green blue

        //part2, you have to USE 2 LOOP and print:
        // red green blue
        // apple lemon peach

        //part3, you have to USE 2 LOOP and print
        // red apple
        // green lemon
        // blue peach


        String[][] array = {
                {"apple", "lemon", "peach"}, //0
                {"red", "green", "blue"}     //1
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //part1.
        System.out.println("HARDCODED 1-----------------------------------------");
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println("HARDCODED 2-----------------------------------------");
        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1] + " ");
        System.out.print(array[0][2] + " ");
        System.out.println();
        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[1][2] + " ");
        System.out.println();
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < array.length; i++) { // 0, 1
            for (int j = 0; j < array[i].length; j++) {// 0, 1, 2
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //part2, you have to USE 2 LOOP and print:
        // red green blue
        // apple lemon peach
        System.out.println("HARDCODED Part 2-----------------------------------------");
        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[1][2] + " ");
        System.out.println();
        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1] + " ");
        System.out.print(array[0][2] + " ");
        System.out.println();
        System.out.println("USING FOR--------------------------------------------");

        for (int i = 1; i >= 0; i--) { // 0, 1
            for (int j = 0; j < array[i].length; j++) {// 0, 1, 2
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //part3
        //           0         1        2
//                {"apple", "lemon", "peach"}, //0
//                {"red", "green", "blue"}     //1
        System.out.println("\nHARDCODE Part 3.0-----------------------------------------");
        // red apple
        // green lemon
        // blue peach
        System.out.print(array[0][0] + " ");
        System.out.print(array[1][0] + " ");
        System.out.println();
        System.out.print(array[0][1] + " ");
        System.out.print(array[1][1] + " ");
        System.out.println();
        System.out.print(array[0][2] + " ");
        System.out.print(array[1][2] + " ");
        System.out.println();

        for (int loop1 = 0; loop1 <= 2; loop1++) {
            for (int loop2 = 0; loop2 <= 1; loop2++) {
                System.out.print(array[loop2][loop1] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHARDCODE Part 3-----------------------------------------");
        // red apple
        // green lemon
        // blue peach
        System.out.print(array[1][0] + " ");
        System.out.print(array[0][0] + " ");
        System.out.println();
        System.out.print(array[1][1] + " ");
        System.out.print(array[0][1] + " ");
        System.out.println();
        System.out.print(array[1][2] + " ");
        System.out.print(array[0][2] + " ");

        System.out.println("loop part");

        System.out.println();

        for (int loop1 = 0; loop1 <= 2; loop1++) {
            for (int loop2 = 1; loop2 >= 0; loop2--) {
                System.out.print(array[loop2][loop1] + " ");
            }
            System.out.println();
        }






    }
}