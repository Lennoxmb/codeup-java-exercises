package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {

    }

    public int getLength() {
        return length;
    }

    public abstract void setLength(int num);

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int num);
}

//Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
//
//protected properties for length and width. x
//a constructor that accepts two numbers for the length and width and sets those properties. x
//methods for getting the length and width.x
//abstract methods for setting the length and width.