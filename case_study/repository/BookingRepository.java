package case_study.repository;

import case_study.model.Booking;
import case_study.ultils.ReadAndWriteFileBooking;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> bookingList = new TreeSet<>(Comparator.comparing(Booking::getRentalStartDate).
            thenComparing(Booking::getLeaseEndDate));
    private String BOOKING_FILE_PATH = "src/case_study/data/booking.csv";
    static {
        bookingList.add(new Booking("BK-1112","11/02/2023","11/03/2023","16/03/2023","KH-1112","SVRO-1112"));
        bookingList.add(new Booking("BK-1113","01/02/2023","01/03/2023","06/03/2023","KH-1113","SVHO-1113"));
        bookingList.add(new Booking("BK-1114","21/02/2023","21/03/2023","26/03/2023","KH-1114","SVRO-1114"));
    }

    @Override
    public TreeSet<Booking> showbooking() {
        bookingList = ReadAndWriteFileBooking.readBookingListFromFile(BOOKING_FILE_PATH);
        return bookingList;
    }

    @Override
    public void addNewBooking(Booking booking) {
        bookingList = ReadAndWriteFileBooking.readBookingListFromFile(BOOKING_FILE_PATH);
        bookingList.add(booking);
        ReadAndWriteFileBooking.writeBookingListToFile(bookingList, BOOKING_FILE_PATH);
    }
}


