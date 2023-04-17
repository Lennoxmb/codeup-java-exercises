package shapes;


public class Rectangle {
    //protected properties
    protected int length;
    protected int width;

    //constructor

    public Rectangle(){

    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

//methods
    public double getArea() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getPerimeter() {
        return (this.length * this.width);
    }
}


//    nside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//
//
//        perimeter = 2 x length + 2 x width
//        area = length x width