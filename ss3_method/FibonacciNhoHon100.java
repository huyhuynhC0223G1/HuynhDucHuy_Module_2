package ss3_method;

import java.util.Scanner;

public class FibonacciNhoHon100 {
    public static void main(String[] args) {
        Fibonacci();
    }
    public static void Fibonacci() {
        int a = 0;
        int b = 1;
        int result = 0;
        int i = 1;
        while (result < 100) {
            a = b;
            b = result;
            result = a + b;
            if (result > 100) {
                break;
            }
            System.out.print(result +", ");
            i++;
        }
    }

}
