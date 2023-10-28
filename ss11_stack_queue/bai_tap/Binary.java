package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số bạn muốn chuyển đổi sang nhị phân");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (n>0) {
            if (n % 2 != 0) {
                stack.add("1");
                n = n / 2;
                i++;
            } else {
                stack.add("0");
                n = n / 2;
                i++;
            }
        }
        System.out.println(String.join("",stack));
    }
}
