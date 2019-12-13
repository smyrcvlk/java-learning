package DEC_07_19.Interface;

public class Task2 {
    // create interface Vehicle
    // add three types of vehicle: Car, Plain, Train

    // open-ended task, add extra class, interface, abstract class if you want
    public static void main(String[] args) {
         Vehicle car= new Car();
         Vehicle train= new Train();
         Vehicle plain= new Plain();

         car.drive();
         train.drive();
         plain.drive();
    }
}
