package OCT_12_19;

public class stringvalueof {
    public static void main(String[] args) {

        // Valueof()which can be used to convert a number to a string
        // Converting integer to String
        int number= 10;
        String s1= String.valueOf(number);

        System.out.println(s1+ 10);
        System.out.println("10"+10);

        System.out.println(number+10);

        // Converting String to integer

        System.out.println("--------------------");

        String s2="30";

        int n2 = Integer.valueOf(s2);
        // 30 + 10 => 40
        System.out.println(s2+10); // "30" + 10 => "3010"
        System.out.println(n2+10); // 30 + 10 => 40
        System.out.println("------------------");


        String s3= "100";
        int n3= Integer.valueOf(s3);
        String s4= "300";
        int  n4= Integer.valueOf(s4);
        System.out.println(n3+n4);

     //





    }
}
