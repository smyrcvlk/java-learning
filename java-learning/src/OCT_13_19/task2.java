package OCT_13_19;

public class task2 {
    public static void main(String[] args) {
         int min=0;
         int max=3;
         int range= max-min;
         int randomInrange= min + (int) (Math.random()*(range +1));
        System.out.println(randomInrange);


         if(randomInrange==0){
             System.out.println("zero");
         }
         if(randomInrange==3){
             System.out.println(("three"));
         }


    }
}
