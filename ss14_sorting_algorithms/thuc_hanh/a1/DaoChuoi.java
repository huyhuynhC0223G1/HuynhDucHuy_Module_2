package ss14_sorting_algorithms.thuc_hanh.a1;

public class DaoChuoi {
    public static void main(String[] args) {
        String originalStr = "abcdef";
        String reversedStr = reverseString(originalStr);
        System.out.println(reversedStr);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversedStr = new String(charArray);
        return reversedStr;
    }
}
