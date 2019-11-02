package OCT_19_19;

import java.util.Scanner;

public class whileex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String line = scan.nextLine();

        //part1
        while (!line.equals("sumeyra")) { //s != "exit"
            System.out.println("Write a string");
            line = scan.nextLine();

            //part2
            if(line.equals("sumeyra")){
                System.out.println("civelek");
            }
        }
    }




    }

