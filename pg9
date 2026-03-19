import java.util.Scanner;

interface Shape {
    public void getdata();
    public void area();
    public void perimeter();
}

// Circle class
class Circle implements Shape {
    double r, a, p;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("Enter the radius of circle:");
        r = sc.nextDouble();
    }

    public void perimeter() {
        p = 2 * 3.14 * r;
        System.out.println(p);
    }

    public void area() {
        a = 3.14 * r * r;
        System.out.println(a);
    }
}

// Rectangle class
class Rectangle implements Shape {
    int l, b, a, p;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.println("Enter the length of rectangle:");
        l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        b = sc.nextInt();
    }

    public void perimeter() {
        p = 2 * (l + b);
        System.out.println(p);
    }

    public void area() {
        a = l * b;
        System.out.println(a);
    }
}

// Main class
public class AreaInterface {
    public static void main(String args[]) {
        int wish, ch;
        Scanner sc = new Scanner(System.in);

        Circle circ = new Circle();
        Rectangle rect = new Rectangle();

        do {
            System.out.println("1. Circle\n2. Rectangle");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    circ.getdata();
                    System.out.println("Area of circle:");
                    circ.area();
                    System.out.println("Perimeter of circle:");
                    circ.perimeter();
                    break;

                case 2:
                    rect.getdata();
                    System.out.println("Area of rectangle:");
                    rect.area();
                    System.out.println("Perimeter of rectangle:");
                    rect.perimeter();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you wish to continue (1/0)?");
            wish = sc.nextInt();

        } while (wish == 1);
    }
}
