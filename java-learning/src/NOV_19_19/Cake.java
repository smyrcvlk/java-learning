package NOV_19_19;

public class Cake {

    String fruits;
    String color;

    public Cake(String f, String yellow) {
        fruits=f;
        color=yellow;
    }


    public static void main(String[] args) {
        Cake Cake=new Cake("banana","yellow" );
        System.out.println(Cake.color +" " +Cake.fruits );
    }
}