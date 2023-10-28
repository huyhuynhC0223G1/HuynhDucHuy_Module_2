package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutiveMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn khiểm tra");
        String string = scanner.nextLine();
        ArrayList<Character> max = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() >= 1 && string.charAt(i) <= list.get((list.size() - 1))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character word : max) {
            System.out.print(word);
        }
    }
}

