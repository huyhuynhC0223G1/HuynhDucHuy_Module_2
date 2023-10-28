package ss3_method;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static boolean checkNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn kiểm tra");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(checkNumber(number));
    }
}
