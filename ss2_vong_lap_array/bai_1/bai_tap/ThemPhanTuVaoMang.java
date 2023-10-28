package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phân tử của mảng");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phân tử thứ " + (i + 1));
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            System.out.print(j);
        }
        System.out.println("Nhập phân tử muốn thêm vào mảng");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vị trí muốn chèn phần tử");
        int index = Integer.parseInt(input.nextLine());
        if (index > 0 && index < array.length) {
            for (int i = array.length - 1; i > 0; i--) {
                if (index == i) {
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        } else {
            System.out.println(" Không chèn được phần tử vào mảng");
        }
        System.out.println(Arrays.toString(array));
    }
}
