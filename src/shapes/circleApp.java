package shapes;
import util.*;

public class circleApp {
    public static void main(String[] args) {
        double radius = new Input().getDouble("please enter radius of circle");
        Circle circle = new Circle(radius);
        System.out.printf("the area of the circle is %.2f%n", circle.getArea());
        System.out.printf("the cercumfrence of your circle is %.2f%n", circle.getCircumference());
    }
}
