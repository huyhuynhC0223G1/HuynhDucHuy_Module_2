package ss15_exception.bai_tap;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleEdgesException("Lỗi: Các cạnh tam giác phải là số dương.");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new TriangleEdgesException("Lỗi: Các cạnh không hợp lệ");
        } else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
