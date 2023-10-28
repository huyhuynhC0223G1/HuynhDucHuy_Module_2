package case_study.controller;

import case_study.service.BookingService;
import case_study.service.ContactService;

import java.util.Scanner;

public class BookingManagement {
    private BookingService bookingService = new BookingService();
    private ContactService contactService = new ContactService();

    public void bookingMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.print("-------------Booking Menu-------------\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n" +
                    "Mời bạn chọn chức năng: ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    bookingService.addNewBooking();
                    break;
                case "2":
                    bookingService.dislay();
                    break;
                case "3":
                    contactService.addNewContract();
                    break;
                case "4":
                    contactService.dislay();
                    break;
                case "5":
                    contactService.editContract();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("6"));
    }
}

