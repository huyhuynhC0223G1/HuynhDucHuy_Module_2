package ss6_inheritance.bai_tap.circle;

public class Circle {
    public int radius = 5;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (radius * radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle: " +
                " radius=" + radius +
                ", color='" + color +
                ", Area: " + getArea();

    }
}
