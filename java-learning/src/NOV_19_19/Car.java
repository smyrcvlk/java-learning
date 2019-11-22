package NOV_19_19;

public class Car {

    int modelYear;
    String modelName;
    public Car(int year,String name){
        modelYear=year;
        modelName=name;
    }

    public static void main(String[] args) {
        Car car=new Car(1991,"Fiat Dogan");
        System.out.println(car.modelName +  car.modelYear);
    }
}
