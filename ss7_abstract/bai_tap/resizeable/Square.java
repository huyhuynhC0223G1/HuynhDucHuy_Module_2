package ss7_abstract.bai_tap.resizeable;
public class Square extends Shape implements IResizeable {
    private double length = 5;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square: " +
                "length=" + length;
    }

    @Override
    public void resize(double percent) {
        System.out.println((length * percent) * (length * percent));
    }
}
