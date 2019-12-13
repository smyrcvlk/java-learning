package DEC_03_19;

public  abstract class BaseClass {
    //you have to create Derived class that inherits from BaseClass
    //your BaseClass has to have abstract void method
    //Your DerivedClass has to have method called study()
    //when you run the Main method, you have run the study method.

    public abstract void study();

    public static void main(String[] args) {
        Derived d= new Derived();
        d.study();
    }
}
class Derived extends BaseClass{
    @Override
    public void study(){
        System.out.println("I am trying");

    }
}
