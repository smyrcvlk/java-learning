package NOV_10_19;

public class task63 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print "true" outside of loop, if it does not contains 4
        // {4, 1, 1} => false
        // {1, 2, 3} => true
        // DON'T USE BREAK
        // Hint: use boolean variable to hold state

        int [] numbers = {1,2,3,5};
        boolean havefour = false;
        // write your code here
        for (int number : numbers) {
            if (number==4){
                havefour=true;
            }
        }
        // end of your code
        if(havefour){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }

}
