package OCT_12_19;

public class StringIndex {
    public static void main(String[] args) {

        //Searching in Strings with index of

                   //01234
        String s1= "Hello";

        System.out.println( s1.indexOf("llo"));

        System.out.println("-------------");

        String s2 = "Techno Study";
        int indexS2= s2.indexOf("Tecqwees  ");

        System.out.println(indexS2);

        System.out.println("ex3-------------");

        String s3= "so something so many";

        int indexS3 = s3.lastIndexOf( "so");

        System.out.println( indexS3);

        System.out.println("task1----------");
        //write code that count length of string and prints sum of length and index of "e"
        //ex "techno" => 6+1= 7
        // hint; length(), indexOf()

        String str = "techno study";
        int length = str.length(); // 12
        int index = str.indexOf("e"); // 1

        int sum = length + index;
        System.out.println(sum);

    }
}
