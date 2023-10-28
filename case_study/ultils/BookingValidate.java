package case_study.ultils;

import java.util.regex.Pattern;

public class BookingValidate {
    public static final String REGER_BOOKING_CODE = "^BK-\\d{4}$";
    public final String REGER_SERVICE_CODE = "^SV((HO)|(RO)|(VL))-\\d{4}$";
    public final String REGER_COSTOMER_CODE = "^KH-\\d{4}$";

    public static boolean checkBookingCode(String bookingCode) {
        return Pattern.matches(REGER_BOOKING_CODE, bookingCode);
    }

    public boolean checkServiceCode(String serviceCode) {
        return Pattern.matches(REGER_SERVICE_CODE, serviceCode);
    }

    public boolean checkCostomerCode(String costomerCode) {
        return Pattern.matches(REGER_COSTOMER_CODE, costomerCode);
    }
}
