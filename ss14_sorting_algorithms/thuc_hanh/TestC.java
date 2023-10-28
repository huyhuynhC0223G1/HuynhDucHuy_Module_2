package ss14_sorting_algorithms.thuc_hanh;

import java.util.*;

public class TestC {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(33);
        set1.add(11);
        set1.add(22);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(3);

        Set<Integer> set3= new LinkedHashSet<>();
        set3.add(6);
        set3.add(2);
        set3.add(3);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
