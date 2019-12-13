package DEC_07_19.Interface;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("drive in highway");
    }
}
