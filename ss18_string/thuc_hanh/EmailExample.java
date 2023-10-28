package ss18_string.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static final String[] validEmail = new String[]{"abc@gmail.com", "ac@yahoo.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "aa@gmail.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email: " + email + "is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email: " + email + " is valid: " + isvalid);
        }
    }
}
