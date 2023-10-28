package case_study.ultils;

import java.util.regex.Pattern;

public class PersonValidate {
    private static final String REGER_EMLOYEE_ID = "^NV-\\d{4}$";
    private static final String REGER_CUSTOMER_ID = "^KH-\\d{4}$";
    private static final String REGER_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String REGER_IDENTITYCARD = "(\\d{9}|\\d{12})$";
    private static final String REGER_NUMBERPHONE = "^0\\d{9}$";
    private static final String REGER_WAGE = "^[1-9]\\d+$";
    private final String REGEX_DATEOFBIRTH = "^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";


    public static boolean checkEmployeeId(String id) {
        return id.matches(REGER_EMLOYEE_ID) ? true : false;
    }
    public static boolean checkCustomerId(String id) {
        return id.matches(REGER_CUSTOMER_ID) ? true : false;
    }

    public boolean checkDateOfBirth(String dayOfBirth) {
        return Pattern.matches(REGEX_DATEOFBIRTH, dayOfBirth);
    }

    public static boolean checkName(String name) {
        return Pattern.matches(REGER_NAME, name) ;
    }

    public static boolean checkIdentityCard(String identityCard) {
        return Pattern.matches(REGER_IDENTITYCARD, identityCard);
    }

    public static boolean checkNumberPhone(String numberPhone) {
        return Pattern.matches(REGER_NUMBERPHONE, numberPhone);
    }

    public static boolean checkEmployeeWage(String wage) {
        return wage.matches(REGER_WAGE) ? true : false;
    }
}
