package ss7_abstract.bai_tap.colorable;
public class Square extends Shape implements IColorable {
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
        return "area square= " + getArea();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
