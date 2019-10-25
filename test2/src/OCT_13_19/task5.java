package OCT_13_19;

public class task5 {
    public static void main(String[] args) {
        // write a program that sums 2 random integer numbers,
        //ex; a=10,
        //b=20,
        //a=b= //

        // 2. way
        int a = (int) (Math.random() * 10); // gets integer form double
        int b = (int) (Math.random() * 100); // gets integer form double
        System.out.println(a);
        System.out.println(b);

        System.out.println(a+b);

    }
}
