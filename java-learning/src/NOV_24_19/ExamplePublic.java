package NOV_24_19;

public class ExamplePublic {
    public static void main(String[] args) {
        Person student =new Person();
        student.name="max";
        System.out.println("form attribute" + student);
        System.out.println("From Method: " + student.giveMeName());
        student.printDetails();
    }
}
