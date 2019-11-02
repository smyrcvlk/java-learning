package OCT_20_19;

public class loopexe3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("begining" + i);
            if(i >= 4){
                continue;
            }
            System.out.println("ending" + i);
            System.out.println();
        }
    }
}

