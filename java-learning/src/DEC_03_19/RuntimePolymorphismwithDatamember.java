package DEC_03_19;

public class RuntimePolymorphismwithDatamember {
    public static void main(String args[]){
        Bike obj=new Honda();
        System.out.println(obj.speedlimit);//90
        obj.Print();
    }
}
    class Bike{
        int speedlimit=90;
        void Print(){
            System.out.println("bike driving");
        }
    }
    class Honda extends Bike{
        int speedlimit=150;
        void Print(){
            System.out.println("honda driving");
        }

    }

