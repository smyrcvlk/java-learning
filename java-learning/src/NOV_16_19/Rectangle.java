package NOV_16_19;

public class Rectangle {

        // Create class Rectangle
        // add attributes,
        // add methods: getPerimeter => (a+b+a+b)
        // getArea => (a*b)

        // in other class print those perimeter and are

    public int shortSide;
    public int longSide;

    // getPerimeter => (a+b+a+b) => 2*(a+b)
    public int getPerimeter() {
        return (shortSide + longSide) * 2;
    }

    // getArea => (a*b)
    public int getArea() {
        return shortSide * longSide;
    }




}
