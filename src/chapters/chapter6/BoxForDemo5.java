package chapters.chapter6;
public class BoxForDemo5 {
    double width;
    double heigth;
    double depth;

    double volume() {
        return width * heigth * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }
}