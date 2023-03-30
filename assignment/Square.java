import java.lang.Math;
class Square extends Shape {
    double sideLength;
    public Square(Posn center, double sideLength) {
        super(center);
        this.sideLength = sideLength;
    }
    public double perimeter() {
        return 4 * sideLength;
    }
    public double area() {
        return sideLength * sideLength;
    }
    public boolean contains(Posn point) {
        return Math.abs(point.x - center.x) <= sideLength / 2 && Math.abs(point.y - center.y) <= sideLength / 2;
    }
}