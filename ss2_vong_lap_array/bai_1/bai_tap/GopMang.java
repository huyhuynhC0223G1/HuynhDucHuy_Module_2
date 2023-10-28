package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array = new int[array1.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            if (i < array1.length) {
                array[i] = array1[i];
            } else {
                array[i] = array2[i - array1.length];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
