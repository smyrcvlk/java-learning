package w3resourcesbasic;

public class ex9 {
    public static void main(String[] args) {
        //Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
        for (int i = 0; i <100 ; i++) {
            if (i%3==0){
                System.out.print(" " + i );
            }

        }
        System.out.println(" ");
        for (int i = 0; i <100 ; i++) {
            if (i%5==0){
                System.out.print(" " + i);
            }

        }
        System.out.println(" ");
        for (int i = 0; i < 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.print(" " + i);
            }

        }
    }
}
