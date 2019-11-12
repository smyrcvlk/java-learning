package NOV_10_19;

public class task62 {
    public static void main(String[] args) {

        // Given an array of ints,
        // print "I have one" outside of loop, if it contains 1's
        // so if you have multiple 1's if should print "I have one" only once
        int [] numbers = {1,2,3,4,5};
        boolean haveOne = false;
        // write your code here
        for (int number : numbers) {
            if (number==1){
                haveOne=true;
            }
        }
        // end of your code
        if(haveOne){
            System.out.println("I have one");
        }

    }

}
