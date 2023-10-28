package ss12_java_collection_framework.bai_tap.dem_so_lan;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Map<Integer, String> map = new HashMap<>();
        String string = "fs d f d f";
        System.out.println("Nhập từ bạn muốn đếm");
        String word = scanner.nextLine();
        int count = 0;
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            map.put(i, array[i]);
        }
        for (int i = 0; i < map.size(); i++) {
            if (word.equals(map.get(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
