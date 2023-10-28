package ss5_access_modifier.bai_tap.access_modifier;

public class Circle {
    //    private double radius = 1.0; "chỉ sử dụng
    protected double radius = 1.0;
    protected String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return (this.radius * this.radius) * 3.14;
    }
}
