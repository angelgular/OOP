// Main class to test the implementation
public class Activity4 {
    public static void main(String[] args) {
        // Create objects of each shape
        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Square square = new Square(4.0, "Green", true);

        // Test polymorphism
        Shape shape1 = circle;
        Shape shape2 = rectangle;
        Shape shape3 = square;

        // Display results
        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        System.out.println(shape2);
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());

        System.out.println(shape3);
        System.out.println("Area: " + shape3.getArea());
        System.out.println("Perimeter: " + shape3.getPerimeter());
    }
}
