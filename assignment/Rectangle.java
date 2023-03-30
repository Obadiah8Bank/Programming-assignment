import java.lang.Math;
class Rectangle extends Shape {
    double width, height;

    public Rectangle(Posn center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double area() {
        return width * height;
    }

    public boolean contains(Posn point) {
        return Math.abs(point.x - center.x) <= width / 2 && Math.abs(point.y - center.y) <= height / 2;
    }

}