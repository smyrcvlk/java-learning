package NOV_09_19;



public class Example1 {
    public static void main(String[] args) {

        String s1=" Hello world";


        char[] charArray= s1.toCharArray();
        System.out.println(charArray[6]);
        charArray[0]= 'A';
        System.out.println(charArray);

        char c= s1.charAt(0);
        Character c1= s1.charAt(0);

        System.out.println(s1.charAt(4)+ " " + s1.charAt(8));


        int length= s1.length();
        System.out.println(length);
        System.out.println(s1.length());
        System.out.println(s1);


        String trimmedS1= s1.trim();
        System.out.println( s1.trim());





    }
}
