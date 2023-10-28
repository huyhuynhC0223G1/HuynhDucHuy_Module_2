package ss6_inheritance.bai_tap.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, "blue", 8);
        System.out.println(cylinder.toString());
    }
}
