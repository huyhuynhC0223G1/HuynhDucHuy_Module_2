package ss14_sorting_algorithms.bai_tap;

import java.util.Arrays;

public class DescribeInsertionSort {
    static int[] array = {5, 6, 4, 3, 8, 9, 2};

    public static void main(String[] args) {
        String str = "dsfrfassads";
        String[] array = str.split("");
        insertionSort(array);
        for (String s : array) {
            System.out.print(s);
        }
    }

    public static void insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String element = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k].compareTo(element) > 0; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = element;
        }
    }

//    public static void insertionSort(int[] array) {
//        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
//        for (int i = 1; i < array.length; i++) {
//            System.out.println("i = " + i);
//            int element = array[i];
//            System.out.println("element = " + array[i]);
//            int k;
//            for (k = i - 1; k >= 0 && array[k] > element; k--) {
//                System.out.println("Vòng lặp k = " + k);
//                array[k + 1] = array[k];
//                System.out.println("array[k+1] = array[k]= " + array[k]);
//                System.out.println("Mảng k =" + k + " là: " + Arrays.toString(array));
//            }
//            array[k + 1] = element;
//            System.out.println("array[k+1] = element= " + element);
//            System.out.println("Mảng sau vòng lặp i thứ  " + i + " là: " + Arrays.toString(array));
//
//        }
//    }

}
