package chapters.chapter8;

abstract class FigureAbst {
    double dim1;
    double dim2;

    FigureAbst(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

