package ss7_abstract.bai_tap.colorable;
import java.util.Arrays;
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Square(5);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
                if (shapes[i] instanceof Square) {
                    ((Square) shapes[i]).howToColor();
            }
        }
    }
}
