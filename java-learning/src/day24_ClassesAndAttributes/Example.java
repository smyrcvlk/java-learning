package day24_ClassesAndAttributes;

public class Example {
    //Java Methods (Void) methods and void static method ,
    // return method (In the same class)

    int x=5;
    int y=42;
    int z=45;
    public static void main(String[] args) {
       Example ex2=new Example();
       Example ex3=new Example();

        System.out.println(ex2.x);
        System.out.println(ex3.y);
    }

    public void PublicMethod() {
    }


    private static void DifferentMethod2() {
    }

    public void DifferentMethod1() {
        System.out.println("print something");
    }

    public void AnyMethod() {
        System.out.println("print here");
    }


}


