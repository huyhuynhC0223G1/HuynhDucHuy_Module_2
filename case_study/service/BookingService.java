package case_study.service;

import case_study.model.Booking;
import case_study.repository.BookingRepository;
import case_study.ultils.BookingValidate;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IBookingService {
    private BookingRepository bookingRepository = new BookingRepository();
    private Scanner scanner = new Scanner(System.in);
    private BookingValidate bookingValidate = new BookingValidate();

    @Override
    public void dislay() {
        TreeSet<Booking> bookingList = bookingRepository.showbooking();
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }

    @Override
    public void addNewBooking() {
        String idBooking;
        do {
            System.out.println("Nhập mã booking: BK-YYYY");
            idBooking = scanner.nextLine();
            if (!bookingValidate.checkBookingCode(idBooking)) {
                System.err.println("sai dinh dang");
            }
        } while (!bookingValidate.checkBookingCode(idBooking));

        String dayBooking;
        System.out.println("Nhập ngày booking: ");
        dayBooking = scanner.nextLine();
        String rentalStartDate;
        System.out.println("Nhập ngày bắt đầu thuê: ");
        rentalStartDate = scanner.nextLine();
        String leaseEndDate;
        System.out.println("Nhập ngày kết thúc thuê: ");
        leaseEndDate = scanner.nextLine();
        String customerCode;
        do {
            System.out.println("Nhập mã Khách hàng:KH-YYYY ");
            customerCode = scanner.nextLine();
            if (!bookingValidate.checkCostomerCode(customerCode)) {
                System.err.println("sai dinh dang");
            }
        } while (!bookingValidate.checkCostomerCode(customerCode));

        String serviceCode;
        do {
            System.out.println("Nhập mã dịch vụ: SV(HO,RO,VL)-YYYY ");
            serviceCode = scanner.nextLine();
            if (!bookingValidate.checkServiceCode(serviceCode)) {
                System.err.println("sai dinh dang");
            }
        } while (!bookingValidate.checkServiceCode(serviceCode));

        Booking newbooking = new Booking(idBooking, dayBooking, rentalStartDate, leaseEndDate, customerCode, serviceCode);
        bookingRepository.addNewBooking(newbooking);
        System.out.println("Thêm mới thành công booking " + newbooking.getIdBooking());
        this.dislay();
    }
}
