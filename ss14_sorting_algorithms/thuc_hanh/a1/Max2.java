package ss14_sorting_algorithms.thuc_hanh.a1;

public class Max2 {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 9,1, 7, 7, 6};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }
        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ hai trong mảng là: " + max2);
        } else {
            System.out.println("Không tìm thấy số lớn thứ hai trong mảng.");
        }

    }
}
