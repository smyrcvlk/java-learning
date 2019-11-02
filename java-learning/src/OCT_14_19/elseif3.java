package OCT_14_19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class elseif3 {
    public static void main(String[] args) {
        //byte -127 <-> 128
        // write a progrm check what  number datatype it is?
        //23= byte
        //12312=int
        //123123123


        Scanner scan = new Scanner(System.in);
        long l = -9223372036854775808L;

        {
            System.out.println("Write a number please:");
            long number = scan.nextLong();

            if (number >= -128 && number <= 127) {
                System.out.println("DataType is byte");

            } else if (number >= -32768 && number <= 32767) {
                System.out.println("data type is short");
            } else if (number >= -2147483648 && number <= 2147483647) {
                System.out.println("data type is int");

            } else if (number >= -9223372036854775808L && number <= 9223372036854775807L) {
                System.out.println("data type is long");

            } else {
                System.out.println("end");
            }
        }
    }
}