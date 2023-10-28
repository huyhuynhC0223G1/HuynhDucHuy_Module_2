package ss14_sorting_algorithms.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    static int[] list = {8, 6, 3, 2, 4, 9, 5};
    public static void main(String[] args) {
        System.out.println("Trước: " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("Sau: " + Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > key; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = key;
        }
    }
}
