package case_study.controller;

import case_study.repository.FacilityRepository;
import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void facilityMenu() {
        FacilityService facilityService = new FacilityService();
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.print("-------------Facility Menu-------------\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n" +
                    "Mời bạn chọn chức năng: ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    facilityService.dislay();
                    break;
                case "2":
                    boolean flagAdd = true;
                    do {
                        System.out.print("----Danh sach---\n" +
                                "1.Add New House\n" +
                                "2.Add New Room\n" +
                                "3.Add New Villa\n" +
                                "4.Back To Menu\n" +
                                "Mời bạn chọn chức năng: ");
                        String choiceAdd = input.nextLine();
                        switch (choiceAdd) {
                            case "1":
                                facilityService.addNewHouse();
                                break;
                            case "2":
                                facilityService.addNewRoom();
                                break;
                            case "3":
                                facilityService.addNewVilla();
                                break;
                            case "4":
                                flagAdd = false;
                                break;
                            default:
                                System.out.println("Bạn chọn sai chức năng: ");
                        }
                    } while (flagAdd);
                    break;
                case "3":
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("4"));
    }
}
