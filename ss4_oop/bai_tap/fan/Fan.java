package ss4_oop.bai_tap.fan;

import java.awt.*;

public class Fan {
    public int speed = 1;
    public boolean on = false;
    public double radius = 5;
    public String color = "Blue";
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public Fan(int speed, boolean on, double radius, String color) {

        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSlow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!this.on) {
            return color + " " + radius + " " + " fan is off";
        }
        return speed + " " + color + radius + " " + " fan is on";
    }
}
