package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width){
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public void setLength(int num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(int num) {
        this.length = num;
        this.width = num;
    }
//    //protected properties
//    protected int length;
//    protected int width;
//
//    //constructor
//
//    public Rectangle(int i){
//        super();
//
//    }
//    public Rectangle(int length, int width) {
//        super();
//        this.length = length;
//        this.width = width;
//    }
//
////methods
//    public double getArea() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getPerimeter() {
//        return (this.length * this.width);
//    }




}


//    nside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//
//        perimeter = 2 x length + 2 x width
//        area = length x width