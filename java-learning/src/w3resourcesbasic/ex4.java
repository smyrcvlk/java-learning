package w3resourcesbasic;

public class ex4 {
    public static void main(String[] args) {
        //Write a Java program to find the duplicate values of an array of string values.
//        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
//
//        for (int i = 0; i < my_array.length-1; i++)
//        {
//            for (int j = i+1; j < my_array.length; j++)
//            {
//                if( (my_array[i].equals(my_array[j])) && (i != j) )
//                {
//                    System.out.println("Duplicate Element is : "+my_array[j]);


        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i < my_array.length - 1; i++) {

            for (int j = i + 1; j < my_array.length; j++) {

                if ((my_array[i].equals(my_array[j])) && (i != j)) {


                    System.out.println("duplicate " +   my_array[j]);

                }


            }
        }
    }

}