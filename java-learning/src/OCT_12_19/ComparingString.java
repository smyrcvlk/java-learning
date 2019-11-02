package OCT_12_19;

public class ComparingString {
    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";

        if (s1 == s2) {
            System.out.println("its equal");
        }
        String s3 = new String("yes");
        String s4 = new String("yes");

        if (s3.equals(s4)) {
            System.out.println("its equal again");
        }

        String name = "Ali";
        if (name.equals("Max")) {
            System.out.println("Hello");
        }

        String nameOfCourse = "TS";
        if (nameOfCourse.equals("TS")) {
            System.out.println("You gonna be Tester after 6 months");
        }

        // Task 1:
        //  check if string is equals to your name, print your surname
        //  ex: Michale => Jackson

        String firstname= "Sumeyra";
        String firstname1= "Sumeyra";

        if(firstname.equals(firstname1)){
            System.out.println("Civelek");


        }

    }




}








