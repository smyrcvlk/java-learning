package OCT_27_19;

public class day15homework {
    public static void main(String[] args) {

// 1. Return the number of even ints in the given array.
        // Hint: you need to count "even numbers"
        // 2.Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
        //

        int[] myArray = {1, 2, 3, 4, 5, 6};
        // part 1
        int count=0;
        System.out.println("Part 1 : ");
        System.out.println("=====================");
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers : " + count);

        // part 2
        System.out.println("");
        System.out.println("Part 2 : ");
        System.out.println("=====================");
        boolean condition1 = false;
        boolean condition2 = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1 ){
                condition1=true;
            }
            if(myArray[i]==2){
                condition2=true;

            }
        }
        if (condition1==true && condition2==true) {
            System.out.println("my array has 1 and 2" );
        } else {
            System.out.println("there aren't 1 and 2 ");
        }

//        Part 1 :
//        =====================
//        Total even numbers : 3
//
//        Part 2 :
//        =====================
//        my array has 1 and 2
//
//        Process finished with exit code 0

    }
}



