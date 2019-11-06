package NOV_05_19;


import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Homework {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the string: ");
            String str = in.nextLine();

            System.out.print("Number of words in the string: " + count_Words(str)+"\n");
        }

    }
    //    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
    //advanced, put in a new class and call the method from the main method.

    public static int count_Words(String str)
    {

        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }



}
