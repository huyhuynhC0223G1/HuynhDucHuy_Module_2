package ss11_stack_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Aiia";
        String str = string.toLowerCase();
        boolean flag = false;
        Stack<String> stack = new Stack<>();
        String[] array = str.split("");
        System.out.println(Arrays.toString(array));
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.offer(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (!stack.pop().equals(queue.remove())) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(string + " không là chuỗi palindrome");
        } else {
            System.out.println(string + "  là chuỗi palindrome");
        }
    }
}
