
package ss1_intrudoction_java.bai_tap;

import java.util.Scanner;

public class BaiTap3 {
    static final String[] ones = new String[]{" ", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};
    static final String[] tens = new String[]{" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

    public BaiTap3() {
    }

    public static void main(String[] args) {
        System.out.print("Input a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num <= 19) {
            System.out.println(ones[num]);
        } else {
            String var10001;
            if (num > 19 && num < 100) {
                var10001 = tens[num / 10];
                System.out.println(var10001 + ones[num % 10]);
            } else if (num >= 100 && num % 100 == 0) {
                var10001 = ones[num / 100 % 10];
                System.out.println(var10001 + " Hundred");
            } else if (num > 100) {
                var10001 = ones[num / 100 % 10];
                System.out.print(var10001 + " hundred and");
                numberToWord(num % 100, " ");
            }
        }

    }

    public static void numberToWord(int num, String value) {
        if (num > 19) {
            String var10001 = tens[num / 10];
            System.out.println(var10001 + ones[num % 10]);
        } else {
            System.out.println(ones[num]);
        }

        if (num > 0) {
            System.out.println(value);
        }

    }
}
