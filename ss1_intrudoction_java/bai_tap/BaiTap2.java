package ss1_intrudoction_java.bai_tap;

import java.util.Scanner;

public class BaiTap2 {
    public BaiTap2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn đổi: ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("Số tiền bạn đổi được là: " + vnd + " VND");
    }
}
