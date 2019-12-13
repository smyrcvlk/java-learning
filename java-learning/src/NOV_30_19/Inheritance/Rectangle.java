package NOV_30_19.Inheritance;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        setColor(color);
        setFilled(filled);

        this.width = width;
        this.length = length;
    }
}
