package thuat_toan;

import java.util.Arrays;

public class Bai2SoLuongKiTuChung {
    public static void main(String[] args) {
        String str = "Abcdef";
        String[] strings = str.split("");
        String str1 = "Adghjklbc";
        String[] strings1 = str1.split("");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings1.length; j++) {
                    if (strings1[j].equals(strings[i])) {
                        count++;
                        break;
                }
            }
        }
        System.out.println(count);
    }
}
