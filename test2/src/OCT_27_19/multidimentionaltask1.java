package OCT_27_19;


public class multidimentionaltask1 {
    public static void main(String[] args) {
        // Create 2D array
        // in first row put names
        // in second row put surnames
//        String[][] namesAndSurname = {
//                {"SUMEYRA", "zeynep", "ayse"},
//
//                {"CIVELEK", "gurler", "yilmaz"},};
//
//
//                 System.out.println(namesAndSurname[0][0]);
//                  System.out.println(namesAndSurname[0][0]+ " " + namesAndSurname [1][0]);
//part1
        String[][] arr = {
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Barak"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };

        System.out.println("part2---------------------------");
        //part2
        System.out.println(arr[0][0] + " " + arr[1][0]);
        System.out.println(arr[0][1] + " " + arr[1][1]);
        System.out.println(arr[0][2] + " " + arr[1][2]);
        System.out.println(arr[0][3] + " " + arr[1][3]);


        System.out.println("part3---------------------------");
        System.out.println("columns at row 0: " + arr[0].length);
        //part3
        //USING ONLY ONE LOOP print names and surnames
        //ex:
        //Bayram Guney
        //Micheal Jackson

        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i] + " " + arr[1][i]);


//        for (int i = 0; i < arr[0].length; i++) {
//            for (int j = 0; j < arr[1].length; j++) {
//                System.out.println(arr [0].length +  arr[1].length );
//            }
//        }


        }
        System.out.println("part 4=========================");

    }
}











