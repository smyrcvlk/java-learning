package DEC_08_19;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("cat sound meowww");
    }

    @Override
    public void feed(Food food) {
        System.out.println(food.getName() + " " + food.getPrice() + " " + food.getCal());
    }



}
