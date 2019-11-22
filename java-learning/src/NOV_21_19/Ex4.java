package NOV_21_19;

 public class Ex4 {
    public static void main(String[] args) {
        Food pie = new Food();
        pie.name = "Teramisu";
//        System.out.println(f.name);
        System.out.println(pie.print());

        System.out.println("-----------------------------");
        Food cake = new Food("Cake");
//        System.out.println(cake.name);
        System.out.println(cake.print());

        System.out.println("-----------------------------");
        Food something = new Food();
        System.out.println(something.print());
    }
}


