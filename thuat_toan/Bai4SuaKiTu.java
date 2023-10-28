package thuat_toan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai4SuaKiTu {
    public static void main(String[] args) {
        String srt = "HuynhDucHuy";
        String[] arr = srt.split("");
        List<String> arrList = new ArrayList<>();
        arrList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())){
                arrList.add(" ");
                arrList.add(arr[i]);
            }else {
                arrList.add(arr[i]);
            }
        }
        System.out.println(String.join((""),arrList).toLowerCase());
    }
}
