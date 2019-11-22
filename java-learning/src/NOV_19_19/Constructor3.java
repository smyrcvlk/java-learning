package NOV_19_19;

public class Constructor3 {
    public int data;
    public Constructor3(){
        data=5;
    }
}
class Test{
    public static void main(String[] args) {
        Constructor3 c3=new Constructor3();
    }

    //answer is compilation error
}