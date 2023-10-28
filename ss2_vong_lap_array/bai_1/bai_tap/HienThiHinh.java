package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the square triangle top-left ");
            System.out.println("4. Print isosceles triangle");
            System.out.println("5. exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Print the square triangle top-left");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Print isosceles triangle");
                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
