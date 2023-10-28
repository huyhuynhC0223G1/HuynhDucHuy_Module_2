package case_study.ultils;

import java.util.regex.Pattern;

public class FacilityValidate {
//   rentalCosts, String numberPeople, String rentalType, String roomStandard, String numberOfFloors
    public final String REGER_HOUSE_CODE = "^SVHO-\\d{4}$";
    public final String REGER_ROOM_CODE = "^SVRO-\\d{4}$";
    public final String REGER_VILLA_CODE = "^SVVL-\\d{4}$";
    public final String REGER_NAME = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    public final String REGER_USABLEEREA = "^[3-9]\\d+|[1-9]\\d{2,}$";
    public boolean checkHouseCode(String code){
        return Pattern.matches(REGER_HOUSE_CODE, code);
    }
    public boolean checkRoomCode(String code) {
        return Pattern.matches(REGER_ROOM_CODE, code);
    }
    public boolean checkVillaCode(String code) {
        return Pattern.matches(REGER_VILLA_CODE, code);
    }
    public boolean checkName(String code) {
        return Pattern.matches(REGER_NAME, code);
    }
    public boolean checkUsableErea(String code) {
        return Pattern.matches(REGER_USABLEEREA, code);
    }
}
