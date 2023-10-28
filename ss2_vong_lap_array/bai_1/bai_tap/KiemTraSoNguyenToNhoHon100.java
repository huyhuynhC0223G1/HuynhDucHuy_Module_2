package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Scanner;

public class KiemTraSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int number = Integer.parseInt(input.nextLine());
        boolean flag = true;
        if (number < 100) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " là số nguyên tố");
            }else{
                System.out.println(number +" không là số nguyên tố");
            }
        } else {
            System.out.println("Số bạn nhập lớn hơn 100");
        }
    }
}
