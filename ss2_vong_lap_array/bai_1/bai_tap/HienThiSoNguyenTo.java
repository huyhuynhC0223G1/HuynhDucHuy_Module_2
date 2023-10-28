package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            boolean isPrime = true;
            if (number == 2 || number == 3) {
                System.out.println(number);
                number++;
                count++;
            }
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(number + ", ");
                count++;
            }
            number++;
        }
    }
}
