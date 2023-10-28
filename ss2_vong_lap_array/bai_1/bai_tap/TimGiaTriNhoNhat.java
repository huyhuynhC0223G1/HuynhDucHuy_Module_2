package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhat {
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
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

