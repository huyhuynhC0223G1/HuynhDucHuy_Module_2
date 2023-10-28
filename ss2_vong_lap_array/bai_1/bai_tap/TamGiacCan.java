package ss2_vong_lap_array.bai_1.bai_tap;

import java.util.Scanner;

public class TamGiacCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = Integer.parseInt(input.nextLine());
        draw(h);
    }
    public static void draw(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 0 || j == 0 || j == i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        for (int i = h; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (i == 0 || j == 0 || j == i - 1 || (i == h && j == i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }
}
