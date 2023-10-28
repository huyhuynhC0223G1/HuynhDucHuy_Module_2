package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        String s = "((1 + 1 ) * ( 1 + 1))";
        String[] s1 = s.split("");
        Stack<String> stack = new Stack<>();
        System.out.println(Arrays.toString(s1));
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("(") || s1[i].equals(")")) {
                stack.add(s1[i]);
            }
        }
        System.out.println(stack);
        boolean flag = true;
        Stack<String> bstack = new Stack<>();
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).equals("(")) {
                bstack.add(stack.get(i));
                count++;
            } else if (stack.get(i).equals(")")) {
                if (bstack.size() == 0) {
                    flag = false;
                    break;
                } else {
                    for (int j = 1; j < bstack.size(); j++) {
                        count1++;
                    }
                }

            }
            if (count1 == count) {
                flag = false;
            } else {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("Flase");
        }
    }
}

