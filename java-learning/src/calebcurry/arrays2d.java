package calebcurry;

public class arrays2d {
    public static void main(String[] args) {
        int[][] grades= {
                {1,5,3},
                {8,4,2,4,3,5,3},
                {4,6,2}

        };
        //System.out.println(grades[1][4]);
        System.out.print(grades.length);
        System.out.print(grades[0].length);
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades.length; j++) {
                System.out.print(grades[i][j] + " ");

            }
            System.out.println();
            
        }

    }
}
