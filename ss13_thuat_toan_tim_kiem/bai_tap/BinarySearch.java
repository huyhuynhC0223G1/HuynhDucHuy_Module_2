package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phân tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phân tử thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần tìm kiếm");
        int x = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(array, 0, size - 1, x);
        if (result == -1) {
            System.out.println("Không tồn tại phần tử.");
        } else
            System.out.println("Phần tử ở vị trí: " + result);
    }


    public static int binarySearch(int[] array, int lelt, int right, int value) {
        if (right >= lelt) {
            int mid = (lelt + right) / 2;
            if (value == array[mid]) {
                return mid;
            }
            if (array[mid] > value) {
                return binarySearch(array, lelt, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }
}
