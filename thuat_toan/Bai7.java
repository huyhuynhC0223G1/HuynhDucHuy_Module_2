package thuat_toan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Bai7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int n = 11;
        solution(a, n);
    }
    static int solution(int[] coins, int amount) {
        int count = 0;
        boolean flag = true;
        Arrays.sort(coins);
        if (coins == null || coins.length == 0 || amount < 0  ) {
            flag = false;
        } else {
            for (int i = coins.length - 1; i > -1; i--) {
                while (amount >= coins[i]) {
                    count += amount / coins[i];
                    amount = amount % coins[i];
                    break;
                }
                if (amount == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        if (flag) {
            return count;
        } else {
            return -1;
        }
    }
//        int[][] arr = {{2, 3, 9, 8},
//                {7, 33, 2, 2},
//                {18, 51, 5, 11}};
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                treeSet.add(arr[i][j]);
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//        System.out.println(treeSet);
//        for (Integer s : treeSet) {
//            if(check(s)==true) {
//                list.add(s);
//            }
//        }
//        System.out.println(list);
//    }
//
//    public static boolean check(int n) {
//        boolean flag = true;
//        if (n < 2) {
//            flag = false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0 || n%3==0) {
//                flag = false;
//            }
//        }
//        if (flag) {
//            return true;
//        }
//        return flag;
//    }

}
