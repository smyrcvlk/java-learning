package practice;


import java.util.Scanner;

public class wed3 {
    public static void main(String[] args) {
        //Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor
        //
        //Test Data
        //Input the 5 numbers : 1 2 3 4 5
        //Expected Output :
        //
        //Input the 5 numbers :
        //1
        //2
        //3
        //4
        //5
        //The sum of 5 no is : 15
        //The Average is : 3.0

        {
            int i, n = 0, s = 0;
            double avg;
            {
                System.out.println("input the 5 numbers:  ");

            }
            for (i=0;i<5;i++)

            { Scanner in = new Scanner(System.in);
            n = in.nextInt();
            s += n;
            avg=s/5;

        }
            System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +s/5);



    }

}}
