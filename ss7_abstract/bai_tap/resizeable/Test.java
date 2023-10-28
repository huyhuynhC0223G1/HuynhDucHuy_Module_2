package ss7_abstract.bai_tap.resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5, 6);
        Square square = new Square(5);
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof IResizeable) {
                ((IResizeable) shapes[i]).resize(10);
            }
        }
        System.out.println(shapes);
    }
}
