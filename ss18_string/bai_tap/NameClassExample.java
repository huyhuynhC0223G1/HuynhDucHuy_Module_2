package ss18_string.bai_tap;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String[] nameClass = new String[]{"A1234G", "a5555K", "C222I", "P1234g"};

    public static void main(String[] args) {
        NameClassExample nameClassExample = new NameClassExample();
        for (String nameclass : nameClass) {
            boolean isvalid = nameClassExample.validate(nameclass);
            System.out.println("Name class " + nameclass + "is valid: " + isvalid);
        }
    }

    private static final String NAME_CLASS_EXAMPLE = "^[APC]+(\\d{4})+[GHIK]$";

    public NameClassExample() {
        pattern = Pattern.compile(NAME_CLASS_EXAMPLE);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
