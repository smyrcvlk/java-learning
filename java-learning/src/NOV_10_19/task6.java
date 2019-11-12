package NOV_10_19;

public class task6 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print true if it contains no 1's or it contains no 4's.

        // {1,2,3} => true
        // {2,3,4} => true
        // {1,2,4} => false

        //Hint: use boolean variable to hold state

        int [] numbers ={2,3} ;

        boolean havefour = false;
        boolean haveone = false;
        for (int number : numbers) {
            if (number==4){
                havefour=true;
            } else if (number==1) {
                haveone = true;
            }
        }

        if (havefour && haveone)
            System.out.println( false);

        else
            System.out.println(true);
    }
}
