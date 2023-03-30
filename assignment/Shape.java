import java.lang.Math;


abstract class Shape {
    Posn center;
    public Shape(Posn center) {
        this.center = center;
    }
    abstract double perimeter();
    abstract double area();
    abstract boolean contains(Posn point);
}








