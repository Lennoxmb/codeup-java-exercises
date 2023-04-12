package shapes;

public class Circle {
    public Circle(int i) {
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        circle1.printCircless();

    }

    private double radius;


    public double Circles(double radius) {
        return (radius * 2);
    }

    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public void printCircless() {
        System.out.printf("%d.%n", radius);
    }
}
