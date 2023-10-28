package ss7_abstract.bai_tap.resizeable;
public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle: " +
                "radius=" + this.radius;
    }
    @Override
    public void resize(double percent) {
        System.out.println((radius * percent) * (radius * percent) * 3.14);
    }
}
