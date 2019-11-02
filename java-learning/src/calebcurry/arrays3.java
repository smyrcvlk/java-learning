package calebcurry;

import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {
        int[] grades1={ 1, 2, 3, 72,5};
        int[] grades2={ 1, 2, 3, 72,5};

        if(grades1==grades2){
            System.out.println("equal");
        }
        if(grades1.equals(grades2)){
            System.out.println("equal");
        }
        if(Arrays.equals(grades1, grades2)){
            System.out.println("equals finally");
        }

    }
}
