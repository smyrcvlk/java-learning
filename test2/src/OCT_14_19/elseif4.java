package OCT_14_19;


import java.util.Scanner;

public class elseif4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String grade = scan.nextLine();

        if (grade.equals("A")) {
            System.out.println("excellent");
        } else if ("B".equals(grade)) {
            System.out.println("good");


        }else if ("C".equals(grade)){
            System.out.println("middle");
        }else if ("D".equals(grade)){
            System.out.println("pass");
        }else if ("F".equals(grade)){
            System.out.println("fail");
        }else{
            System.out.println("invalid grade");
        }
    }
}







