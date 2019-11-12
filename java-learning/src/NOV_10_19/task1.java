package NOV_10_19;

public class task1 {
    public static void main(String[] args) {
        // write a java program that find maximum
        // of two numbers
         int a=10;
         int b=4;


         if (a>b){
             System.out.println("max is"+ a);
         }else{
             System.out.println("max is" + b);

             //2.way

            int max = Math.max(a, b);
            System.out.println("Max is:" + max);
//        Math.min()
//        Math.max()
//        Math.sqrt()
//        Math.random()
//        Math.abs()

            //3. way
            int max2 = (a >= b) ? a : b;
            System.out.println("Max2 is:" + max2);
        }

    }

}
