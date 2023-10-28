package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class WStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String mStack = "Huy Duc Huynh";
        System.out.println("before: " + mStack);
        String[] arr = mStack.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        String[] array = new String[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(String.join(" ", (array)));
    }
}
