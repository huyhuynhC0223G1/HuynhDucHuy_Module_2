package ss7_abstract.bai_tap.colorable;

import java.util.Objects;

public class Circle extends Shape implements IColorable {
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
        return "area circle= " + getArea();
    }
    @Override
    public void howToColor() {
//        System.out.println("momkmm");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
