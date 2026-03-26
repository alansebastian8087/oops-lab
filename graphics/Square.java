package graphics;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double area() {
        return length * length;
    }
}
