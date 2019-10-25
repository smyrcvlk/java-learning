package OCT_14_19;

import java.util.Scanner;

public class elseif2 {
    public static void main(String[] args) {

        //write a program that print temperature in human readable words
        //ex: 70 => hot
        Scanner scan = new Scanner(System.in);


        int temperature = scan.nextInt();
        if(temperature >= 70){
            System.out.println("Hot");
        }else if(temperature < 70 && temperature >= 50){
            System.out.println("Warm");
        }else if (temperature <50 && temperature>=20){
            System.out.println("cold");

        }else if (temperature <20 && temperature>= 0){
            System.out.println("freezing");
        }
        // cold
        // freezing





    }
}
