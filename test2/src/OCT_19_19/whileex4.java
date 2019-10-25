package OCT_19_19;

import java.util.Scanner;

public class whileex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("begin");
        while (true) {
            System.out.println("write text:  ");
            String str=s.nextLine();
            if(str.equals("quit")){
                break;
            }
            if(str.length() >= 10){
                System.out.println("string is too large");
            }
        }

        System.out.println("end");
    }

}
