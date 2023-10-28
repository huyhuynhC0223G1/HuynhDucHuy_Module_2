package case_study.controller;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    public void employeeMenu() {
        EmployeeService employeeService = new EmployeeService();
        FuramaController furamaController = new FuramaController();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("-------------Employee Menu------------\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    "Mời bạn chon chức năng: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    employeeService.dislay();
                    break;
                case "2":
                    employeeService.addNewStaff();
                    break;
                case "3":
                    employeeService.editStaff();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Bạn chọn sai chức năng.");
            }
        } while (flag);
    }
}
