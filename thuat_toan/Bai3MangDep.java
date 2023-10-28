package thuat_toan;

public class Bai3MangDep {
    public static void main(String[] args) {
        int[] arr = {1, 2, -1, 3};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            sum2 += arr[i];
        }
        if (sum1 == sum2) {
            System.out.println("Mảng đẹp");
        } else {
            System.out.println("Không phải mảng đẹp");
        }
    }
}