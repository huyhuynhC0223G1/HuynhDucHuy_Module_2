package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    public void costomerMenu() {
        CustomerService customerService=new CustomerService();
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.print("-------------Costomer Menu-------------\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n" +
                    "Mời bạn chọn chức năng: ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    customerService.dislay();
                    break;
                case "2":
                    customerService.addCustomer();
                    break;
                case "3":
                    customerService.editCustumer();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("4"));
    }
}
