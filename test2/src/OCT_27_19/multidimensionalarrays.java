package OCT_27_19;

public class multidimensionalarrays {
    public static void main(String[] args) {
        int[] apple = {3, 4, 5};
        int[] milk = {3, 3, 3};

        for (int i = 0; i < apple.length; i++) {
            System.out.print(apple[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < milk.length; i++) {
            System.out.print(milk[i] + " ");
        }

        int[][] array2D = {
                // 0  1  2 columns
                {23, 4, 5},// 0. row

                {3, 3, 3, 23, 24, 34},// 1. row
        };

        System.out.println("\n2D Array ----------------");

        System.out.println("Item rows: " + array2D.length);
        System.out.println("Item 0.row length: " + array2D[0].length);


//        for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[i].length; j++) {
////                System.out.print(items[row][col] + " ");
//                System.out.println(i + "-" + j + " value: "+ items[i][j]);
//            }
//            System.out.println();
//        }
    }
}

