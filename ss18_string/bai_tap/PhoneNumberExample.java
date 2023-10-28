package ss18_string.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String[] phoneNumber = new String[]{"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        for (String phonenumber : phoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phonenumber);
            System.out.println("Phone number: " + phonenumber + " is valid: " + isvalid);
        }
    }

    public static final String PHONE_NUMBER_EXAMPLE = "^[(]\\d{2}[)]-[(](0)\\d{9}[)]$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_NUMBER_EXAMPLE);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
