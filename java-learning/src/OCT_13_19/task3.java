package OCT_13_19;

public class task3 {
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInrange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInrange);

        if (randomInrange <0) {
            System.out.println("negative");
        }
        if (randomInrange >0) {
            System.out.println("positive");
        }

    }
}