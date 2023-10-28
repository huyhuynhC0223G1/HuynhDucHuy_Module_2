package case_study.controller;

import java.util.Scanner;

public class FuramaController {

    public void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagement bookingManagement = new BookingManagement();
        PromotionManagement promotionManagement = new PromotionManagement();
        boolean flag = true;
        do {
            System.out.println("-------------Furama Menu------------\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Mời bạn chon chức năng: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    employeeManagement.employeeMenu();
                    break;
                case "2":
                    customerManagement.costomerMenu();
                    break;
                case "3":
                    facilityManagement.facilityMenu();
                    break;
                case "4":
                    bookingManagement.bookingMenu();
                    break;
                case "5":
                    promotionManagement.promotionMenu();
                    break;
                case "6":
                    flag = false;
                    System.out.println("Thoát chương trình. ");
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng.");
            }
        } while (flag);
    }
}
