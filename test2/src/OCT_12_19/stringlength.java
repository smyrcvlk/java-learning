package OCT_12_19;

public class stringlength {
    public static void main(String[] args) {

        String s1 = "ABCDE";
        System.out.println( s1.length());

        int length = s1.length();
        System.out.println( length);

        String username = "techno.study";
        if(username.length() < 10 ) {
            System.out.println( "you can login");
        }
        if(username.length()  >= 10 ){
            System.out.println( "you cannot login");
        }
       // Task 1; write a program that sums two string length
        // "ABC", "z" => 3 +1
        //output ;"length is 4"
        String a = "ABC";
        String b ="Z";
        System.out.println( a.length()+b.length());
        //task2; Write a program that check if the subtraction of s1 and s2 s length is less than 0, if it is less print "can not proced"
        // else "wec an do it "

        int lenghta= a.length();
        int lengthb= b.length();

        int sum =lenghta +lengthb;
        System.out.println("length is "+ sum);


        String c1= "longStringHere;";
        String c2= "ShortOne";
        int lengthc1= c1.length();
        int lengthc2= c2.length();
        int subtraction = lengthc1 -lengthc2;

        if (subtraction <0 ){
            System.out.println( "you can not proceed");

            }
        else
            System.out.println("we can do it");

        }







    }

