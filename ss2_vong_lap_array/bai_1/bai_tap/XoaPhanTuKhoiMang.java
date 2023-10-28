package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phân tử của mảng: ");
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
        System.out.println("Nhập phần tử trong mảng bạn muốn xóa khỏi mảng");
        int a = Integer.parseInt(input.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    if (array[j + 1] == a) {
                        i--;
                    } else {
                        continue;
                    }
                }
                array[array.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
