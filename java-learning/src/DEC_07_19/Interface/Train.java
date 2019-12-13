package DEC_07_19.Interface;

public class Train implements Vehicle, Flyingvehicles, vehiclesinsea {

    @Override
    public void drive() {
        System.out.println("drive on the railroad");
    }

    @Override
    public void fly() {
        System.out.println(" Train cannot fly");
    }

    @Override
    public void sea() {
        System.out.println(" train cannot drive on the sea");

    }
}
