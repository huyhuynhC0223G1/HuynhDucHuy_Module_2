package ss15_exception.bai_tap;

import java.util.Scanner;

public class TestTriangEdges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleEdgesCheck triangleEdgesCheck = new TriangleEdgesCheck();
        try {
            System.out.println("Nhập cạnh a");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh b");
            double b = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh c");
            double c = Double.parseDouble(sc.nextLine());
            triangleEdgesCheck.checkTriangleEdges(a, b, c);
        } catch (TriangleEdgesException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
