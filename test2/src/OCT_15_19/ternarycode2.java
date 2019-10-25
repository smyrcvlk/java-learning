package OCT_15_19;

import java.sql.SQLOutput;

public class ternarycode2 {
    public static void main(String[] args) {
        //find out max number between two inputs, use user input and ternary operator
   int val1 = 10;
   int val2 = 20;

    int max =(val1>=val2)? val1:val2;
    int min= (val1<=val2)? val1:val2;
    int x= -55;

    int abs= x<0 ? -x: x;
    if (x<0){
        abs= -x;


    }else {
        abs=x;
    }

        System.out.println(max);

        System.out.println(min);

        System.out.println(abs);
//    output
//    20
    }
}
