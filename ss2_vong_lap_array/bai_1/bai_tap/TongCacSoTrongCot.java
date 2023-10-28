package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Scanner;

public class TongCacSoTrongCot {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vị trí cột bạn muốn tính tổng");
        int index = Integer.parseInt(input.nextLine());
        int sum = 0;
        if (index < array[0].length)
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (index == j) {
                        sum += array[i][j];
                    }
                }
            }
        System.out.println(sum);
    }
}
