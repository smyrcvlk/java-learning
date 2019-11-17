package NOV_16_19;

public class bird {
    public static void main(String[] args) {
        Animal bird=new Animal();

        bird.legs=2;
        bird.age=3;
        bird.weight=30;
        bird.name="mavis" ;
        bird.poisonous=false;
        bird.breed=" ";
        bird.cuteness();
        int speed=bird.getSpeed();
        System.out.println("name" + speed);
        System.out.println("age" +  bird.age) ;

        String output=bird.toString();
        System.out.println();

    }
}
