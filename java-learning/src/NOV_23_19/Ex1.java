package NOV_23_19;




class Calculator{

    private Calculator(){

    }


    public  static int sum(int a, int b){
        return a+b;
    }
}
public class Ex1 {
    public static void main(String[] args) {
        int result1 = Calculator.sum (1,2);
        int result2= Calculator.sum(2,2);
    }
}
