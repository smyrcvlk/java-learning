package OCT_14_19;

import java.util.Scanner;

public class daysbreak {
    public static void main(String[] args) {


// write a program which will tell you day of week
// 1 2 3 4 5 6 7
// Monday, Tuesday etc..
// 1 => Monday
// 7 => Sunday
Scanner scanner = new Scanner(System.in);
        System.out.println("provide a day betwwn Monday -Sunday");

        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("1");
                break;
            case " Tusday":
                System.out.println("2");
                break;
            case " Wednesday":
                System.out.println("3");
                break;
            case " Tursday":
                System.out.println("4");
                break;
            case " Friday":
                System.out.println("5");
                break;
            case " Saturday":
                System.out.println("6");
                break;
            case " Sunday":
                System.out.println("7");
            default:
                System.out.println("not in range");
                break;


        }


    }
}


