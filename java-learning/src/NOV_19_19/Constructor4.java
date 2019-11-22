package NOV_19_19;

public class Constructor4 {
    private Constructor4(int data){
        System.out.println("constructor called");
    }
    public  void myMethod(){
        System.out.println("Method called");
    }
    static Constructor4 create(int data) {
        Constructor4 c4= new Constructor4(data);
        return c4;
   }

    public static void main(String[] args) {
        Constructor4 Myclass=  Constructor4.create(42);
        Myclass.myMethod();
    }
}
//a) Constructor called Method called Answer A
//b) Compilation error
//c) Runtime error
//d) None of the above