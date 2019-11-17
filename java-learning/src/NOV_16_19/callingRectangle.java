package NOV_16_19;

public class callingRectangle {

        public static void main(String[] args) {
            Rectangle x = new Rectangle();

            Rectangle rect1 = new Rectangle();
            rect1.longSide = 10;
            rect1.shortSide = 5;

            int perimeter = rect1.getPerimeter();
            System.out.println("Perimeter is: " + perimeter);

            int area = rect1.getArea();
            System.out.println("Area is: " + area);
        }

}
