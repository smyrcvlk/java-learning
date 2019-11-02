package OCT_6_19;

public class ifexamp {
    public static void main(String[] args) {
        int temperature = 100;
        if (temperature >= 70) {
            System.out.println("it's hot");

        }
        if (temperature < 70 && temperature >= 60) {
            System.out.println("it's warm");

        }
        if(temperature < 60&& temperature  >= 20)  {
            System.out.println( "cool");

        }
        if(temperature< 20){
            System.out.println("freezing");

        }
    }
}
