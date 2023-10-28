package ss3_method;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static boolean namNhuan(int number) {
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm bạn muốn kiểm tra");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(namNhuan(number));
    }
}
