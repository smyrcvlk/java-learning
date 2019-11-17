package day24_JavaClassAttributes;

public class MyClass {
    int x=5;
    int y=6;
    int z=45;

    final int a=42;

    public static void main(String[] args) {
        MyClass obj=new MyClass();
        MyClass obj2=new MyClass();

       // obj.y=42;
       // obj.z=2;
       // obj.a=45;

        obj2.x=25;

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj2.x);
        System.out.println(obj.x);

    }


}
