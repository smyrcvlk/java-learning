package NOV_09_19;

public class task3 {
    public static void main(String[] args) {
        //3. Write a Java program to print the grid of zeros with length m x n

        int m = 5;
        int n = 5;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}



