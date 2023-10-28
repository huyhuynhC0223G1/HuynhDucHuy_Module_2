package thuat_toan;

import java.util.Arrays;

public class Bai5SapXep {
    public static void main(String[] args) {
        int[] arr = {150, -1, 190, 170, -1, -1, 160, 180};
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
            } else {
                min = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == -1 || min < arr[j]) {
                        continue;
                    } else {
                        int temp = arr[i];
                        min = arr[j];
                        arr[i] = min;
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

