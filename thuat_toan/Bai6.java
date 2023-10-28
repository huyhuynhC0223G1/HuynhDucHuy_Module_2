package thuat_toan;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        List<Integer> b = new ArrayList<>();
        for (int i = 9; i <= 13; i++) {
            String s = String.valueOf(i);
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                b.add(Integer.parseInt(s));
            }
        }
        int[] a = new int[b.size()];
        for (int i = 0; i < b.size(); i++) {
            a[i] = b.get(i);
        }
        System.out.println(Arrays.toString(a));


//        String str = "abdcef123d";
//        String[] a = str.split("");
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            int value = 0;
//            for (int j = 0; j < a.length; j++) {
//                if (a[j].equals(a[i])) {
//                    value++;
//                }
//            }
//            if (value > 1) {
//                if (list.contains(a[i])) {
//                } else {
//                    list.add(a[i]);
//                }
//            }
//        }
//        System.out.println(list);
    }
}
