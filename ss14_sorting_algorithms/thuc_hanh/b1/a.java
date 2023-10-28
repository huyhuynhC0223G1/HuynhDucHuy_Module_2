package ss14_sorting_algorithms.thuc_hanh.b1;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 3, 1, 9, 7, 9, 10};

        int thirdLargest = findThirdLargest(numbers);
        System.out.println("số lớn thứ 3 là: " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr) {
        Arrays.sort(arr);
        int distinctCount = 1;
        int thirdLargest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                distinctCount++;

                if (distinctCount == 3) {
                    thirdLargest = arr[i];
                    break;
                }
            }
        }
        return thirdLargest;
    }
}
