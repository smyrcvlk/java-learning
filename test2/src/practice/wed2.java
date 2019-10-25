package practice;

import java.util.Scanner;

public class wed2 {
    public static void main(String[] args) {
        //Take three numbers from the user and print the greatest number. Go to the editor
        //
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //Expected Output :
        //The greatest: 87





        Scanner in = new Scanner(System.in);
        System.out.println("input 1.st number: ");
        int num1 = in.nextInt();
        System.out.println("input 2.nd number:  ");
        int num2 = in.nextInt();
        System.out.println("input 3.rd number");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3) {
                System.out.println("The graetest number:" + num1);

            }if(num2>num1)
                if(num2>num3){
                    System.out.println("The greatest number:"  +num2);
                }if(num3>num1)
                    if(num3>num2){
                        System.out.println("The greatest number:"+num3);
                    }
    }
}