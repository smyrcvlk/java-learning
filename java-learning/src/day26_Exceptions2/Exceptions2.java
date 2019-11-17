package day26_Exceptions2;

public class Exceptions2 {
    public static void main(String[] args) {
        int x=1;
        int y=0;

        try{
            int result= computeDivision(x,y);
        }
        // matching ArithmeticException
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static int computeDivision(int x, int y) {

        int result=x/y;
        return result;
    }
}
