package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    public void promotionMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.print("-------------Facility Menu-------------\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n" +
                    "Mời bạn chọn chức năng: ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("3"));
    }
}
