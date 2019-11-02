package calebcurry;

import java.util.Arrays;

public class arrays4fill {
    public static void main(String[] args) {
        int []grades={1,2,3,72,5};
        Arrays.fill(grades,72);
        System.out.println(Arrays.toString(grades));
    }
}
