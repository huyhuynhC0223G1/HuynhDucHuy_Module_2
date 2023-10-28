package ss3_method;

import java.util.Scanner;

public class SoChanSoLe {
    public static boolean isOdd(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return num % 2 == 0;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra có phải số chẵn không");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(isOdd(number));
    }
}
