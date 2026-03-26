import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);
        Circle circle = new Circle(7);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5,9);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
        
    }
}
