package NOV_30_19.Inheritance;

public class Task2 {
    // create base class Shape add attributes
    // create two subclass as Circle and Rectangle

    // Shape: color, filled
    // Circle: radius
    // Rectangle: width, length
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Green");
        circle.setRadius(10.0);
        circle.setFilled(true);

        Rectangle rectangle = new Rectangle("Yellow", true, 5, 3);

        System.out.println(rectangle.getColor());

    }
}

