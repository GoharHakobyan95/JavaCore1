package chapters.chapter8;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }

}

