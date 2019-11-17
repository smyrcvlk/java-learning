package NOV_16_19;

public class MyPets {
    public static void main(String[] args) {
        //Arraylist<Integer> List= New Arraylist<>();
        Animal tiger=new Animal();

        tiger.legs=4;
        tiger.age=5;
        tiger.weight=200.10;
        tiger.name="Richard Parker" ;
        tiger.poisonous=false;
        tiger.breed="Bangal";
        tiger.cuteness();
        int speed=tiger.getSpeed();
        System.out.println("speedc of tiger"  + speed);
        System.out.println("can my tiger jump" + tiger.canJump()) ;

        String output=tiger.toString();
        System.out.println();
    }
}
