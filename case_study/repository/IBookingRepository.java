package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;

import java.util.TreeSet;

public interface IBookingRepository {
//    1.Add new booking
//2.Display list booking

    TreeSet<Booking> showbooking();

    void addNewBooking(Booking booking);
}
