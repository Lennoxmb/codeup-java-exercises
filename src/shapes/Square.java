package shapes;

public class Square extends Rectangle {


    public Square(){

    }
    public Square(int side) {
        this.length = side;
        this.width = side;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }


    public double getPerimeter() {
        return length * 4;
    }

}


//In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//
//perimeter = 4 x side
//area = side ^ 2

//Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,