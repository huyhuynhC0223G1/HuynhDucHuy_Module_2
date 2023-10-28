package ss6_inheritance.bai_tap.circle;

import ss6_inheritance.bai_tap.circle.Circle;

public class Cylinder extends Circle {
    private int height = 5;

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getValume() {
        return (radius * height * 3.14);
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                "height=" + height +
                ", radius=" + radius +
                ", valume= " + getValume();
    }
}

