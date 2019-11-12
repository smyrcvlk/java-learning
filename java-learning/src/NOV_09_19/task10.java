package NOV_09_19;

public class task10 {
    public static void main(String[] args) {

//write a java program that iterates in reverse order on
        // an array using while-loop

        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
            
        }
        System.out.println();
        System.out.println("======================");
        int i = intArray.length-1;
        while (i >=0) {
            System.out.print(intArray[i] + " ");

            i--;
        }
//        int i = intArray.length - 1;
//        int j = 0;
//        while (i >= 0) {
//            System.out.println(intArray[i] + " " + intArray[j]);
//            i--;i


    }

}
