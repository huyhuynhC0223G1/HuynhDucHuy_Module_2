package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;

public class StringMax {
    public static void main(String[] args) {
        String string = "welcome";
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character str : max) {
            System.out.print(str);
        }
    }
}