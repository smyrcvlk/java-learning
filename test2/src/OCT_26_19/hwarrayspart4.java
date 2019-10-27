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


        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.println("arrays are same");
            } else {
                System.out.println("arrays are different");
            }

            int[] c = {3, 2, 6};
            int[] d = {5, 6, 7,};

            for (i = 0; i < a.length; i++) {
                if (c[i] != d[i]) {
                    System.out.println("arrays are different");
                } else {
                    System.out.println("arrays are different");
                }
            }
        }
    }
}