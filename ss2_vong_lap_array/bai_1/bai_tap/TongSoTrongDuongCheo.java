package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongSoTrongDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phân tử mảng");
        int size = Integer.parseInt(input.nextLine());
        int sum = 0;
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Nhập phân tử thứ" + (i + 1));
                array[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || ((i + j) == (array[i].length - 1))) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
