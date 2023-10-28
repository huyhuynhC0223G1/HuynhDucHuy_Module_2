package thuat_toan;

import java.util.*;

public class Bai1KiemTraTanSoXuatHien {
    public static void main(String[] args) {
        String str = "4, 3, 2, 1, 4, 2, 3, 1, 1";
        String[] arr = str.split("");
        boolean flag = false;
        Map<String, Integer> map = new HashMap<>();
        List<String> array = new ArrayList<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            array.add(String.valueOf(map.get(s)));
        }
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i-1).equals(array.get(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
