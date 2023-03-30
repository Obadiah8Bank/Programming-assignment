import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // Create a rectangle with width 6 and height 4 centered at (-2, -2)
        Shape rectangle = new Rectangle(new Posn(-2, -2), 6, 4);
        System.out.println(rectangle.perimeter()); // output: 20.0
        System.out.println(rectangle.area()); // output: 24.0
        System.out.println(rectangle.contains(new Posn(-1, 0))); // output: true
        System.out.println(rectangle.contains(new Posn(3, 3))); // output: false

        // Create a square with side length 5 centered at (0, 0)
        Shape square = new Square(new Posn(0, 0), 5);
        System.out.println(square.perimeter()); // output: 20.0
        System.out.println(square.area()); // output: 25.0
        System.out.println(square.contains(new Posn(2, 2))); // output: true
        System.out.println(square.contains(new Posn(3, 3))); // output: false

// Create a circle with radius 3 centered at (1, 1)
        Shape circle = new Circle(new Posn(1, 1), 3);
        System.out.println(circle.perimeter()); // output: 18.84955592153876
        System.out.println(circle.area()); // output: 28.274333882308138
        System.out.println(circle.contains(new Posn(1, 4))); // output: true
        System.out.println(circle.contains(new Posn(4, 4))); // output: false

    }
}
