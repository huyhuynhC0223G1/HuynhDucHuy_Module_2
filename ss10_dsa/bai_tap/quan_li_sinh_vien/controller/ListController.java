package ss10_dsa.bai_tap.quan_li_sinh_vien.controller;

import ss10_dsa.bai_tap.quan_li_sinh_vien.service.StudentService;
import ss10_dsa.bai_tap.quan_li_sinh_vien.service.TeacherService;

import java.util.Scanner;

public class ListController {
    private StudentService studentService = new StudentService();
    private TeacherService teacherService = new TeacherService();

    public void ListControlerMenu() {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("----------Quản lí học viên-----------\n" +
                    "1. Thêm mới học viên \n" +
                    "2. Xoá học viên \n" +
                    "3. Xem danh sách học viên \n" +
                    "0. Thoát \n" +
                    "Mời chọn chức năng: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    studentService.addNewStudent();
                case "2":
                    studentService.deleteStudent();
                case "3":
                    studentService.dislayStudentList();
                case "0":
                    flag = false;
                    System.out.println("Thoát quản lí sinh viên");
                default:
                    System.out.println("Bạn chọn chưa đúng chức năng");
            }
        } while (flag);
    }
}
