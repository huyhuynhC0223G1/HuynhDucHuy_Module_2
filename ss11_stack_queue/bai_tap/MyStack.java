package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(3);
        stack.add(2);
        stack.add(1);
        System.out.println("Stack: " + stack);
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}