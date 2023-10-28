package ss14_sorting_algorithms.thuc_hanh;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        if (Arrays.stream(numbers).allMatch(n -> n % 2 != 0)) {
            System.out.println("Lẻ");
        } else if (Arrays.stream(numbers).allMatch(n -> n % 2 == 0)) {
            System.out.println("Chẵn");
        } else {
            System.out.println("Vừa chẵn lẻ");
        }
    }















//        int height = 5;
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= height - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        int[] numbers = {5, 2, 8, 12, 3, 10};
//        int secondLargest = findSecondLargest(numbers);
//        System.out.println("Số lớn thứ hai trong mảng là: " + secondLargest);
    }
//        public static int findSecondLargest(int[] arr) {
//            int max1 = Integer.MIN_VALUE;
//            int max2 = Integer.MIN_VALUE;
//
//            for (int num : arr) {
//                if (num > max1) {
//                    max2 = max1;
//                    max1 = num;
//                } else if (num > max2 && num < max1) {
//                    max2 = num;
//                }
//            }
//
//            return max2;
//        }




