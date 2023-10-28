package ss14_sorting_algorithms.thuc_hanh.a1;

import java.util.Arrays;

public class Day5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,1};
        boolean isPalin = isPalindrome(array);
        if (isPalin) {
            System.out.println("Đây là mảng đối xứng.");
        } else {
            System.out.println("Đây là mảng không đối xứng.");
        }
    }
        public static boolean isPalindrome(int[] array) {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                if (array[start] != array[end]) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
}
//        String str = "radar";
//
//        boolean isPalin = isPalindrome(str);
//        if (isPalin) {
//            System.out.println("Đây là chuỗi đối xứng");
//        } else {
//            System.out.println("Đây là chuỗi không đối xứng.");
//        }

//    public static boolean isPalindrome(String input) {
//        int start = 0;
//        int end = input.length() - 1;
//
//        while (start < end) {
//            if (input.charAt(start) != input.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//
//        return true;
//    }