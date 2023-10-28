package ss3_method;

import java.util.Arrays;
import java.util.Scanner;

public class TimUoc {
    public static int size(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static int[] text(int number) {
        size(number);
        int index = 0;
        int[] array = new int[size(number)];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn tìm ước");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(Arrays.toString(text(number)));
    }
}
