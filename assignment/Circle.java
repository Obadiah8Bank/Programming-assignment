import java.lang.Math;
class Circle extends Shape {
    double radius;
    public Circle(Posn center, double radius) {
        super(center);
        this.radius = radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public boolean contains(Posn point) {
        double dx = point.x - center.x;
        double dy = point.y - center.y;
        return Math.sqrt(dx * dx + dy * dy) <= radius;
    }
}