package ss6_inheritance.bai_tap.point3;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 3, 5);
        System.out.println(moveablePoint.move());
    }
}
