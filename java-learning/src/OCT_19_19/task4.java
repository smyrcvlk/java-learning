package OCT_19_19;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write a text: ");
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            }

            if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("*")) {
                System.out.println("Strong Password");

            } else {
                System.out.println("weak password");
            }

            if (line == line.toUpperCase())
                System.out.println("use lowercase letters");
            // part3. check text if it's only uppercase print "use lowercase letters"
            // Hint: line.toUpperCase();
            //       line.equals();

            //"ABCDEFG" == "ABCDEFG"
            String lineUpperCase = line.toUpperCase();
            String lineLowerCase= line.toLowerCase();
            if (line.equals(lineUpperCase)) {
                System.out.println("use lowercase letters");

            // part4. check text if it's only lowercase print "use uppercase letters"
        }    else if (line.equals(lineLowerCase)) {
            System.out.println("use uppercase letters");
        }





    }
} }
