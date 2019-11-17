package NOV_16_19;

public class task5 {

    public static void main(String[] args) {


        // Write a boolean method called isOdd,
        //    which takes an int as input and returns true if the it is odd.
        int myNumber = 10;
        System.out.println();
    }
        public static boolean isodd ( int n){
            boolean oddcondition= n%2!=0;
            boolean result=false;
            if (oddcondition){
                result=true;

            }else {
                result=false;
            }
            return result;
        }
    }

