package OCT_26_19;

public class hwarrayspart4 {
    public static void main(String[] args) {
        // part4. check every element, if they are same print => "arrays are same"
        //ex:
        // a = {5, 6, 7}
        // b = {5, 6, 7}
        // => "arrays are same"
        //ex2:
        // a = {3, 2, 6}
        // b = {5, 6, 7}
        // => "arrays are different"
        int[] a = {5, 6, 7,};
        int[] b = {5, 6, 7,};


        boolean same = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                same = false;
                break;
            }
        }

        if (same) {
            System.out.println("arrays are same");
        } else {
            System.out.println("arrays are different");
        }


        int[] c = {3, 2, 6};
        int[] d = {5, 6, 7,};
        boolean different = true;
        for (int j = 0; j < a.length; j++) {
            if (c[j] == d[j]) {
                different = true;
                break;
            }
        }
        if (different) {
            System.out.println("arrays are different");
        } else {
            System.out.println("arrays are same");
        }
    }
}