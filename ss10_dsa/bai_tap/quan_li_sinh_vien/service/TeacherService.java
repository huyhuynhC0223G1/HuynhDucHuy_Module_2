package ss10_dsa.bai_tap.quan_li_sinh_vien.service;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Teacher;
import ss10_dsa.bai_tap.quan_li_sinh_vien.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    Scanner scanner = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void dislayTeacherList() {
        List<Teacher> teacherList = teacherRepository.getTeacherList();
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }

    @Override
    public void addNewTeacher() {
        System.out.println("Nhập id giảng viên:");
        int teacherId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên giảng viên:");
        String teacherName = scanner.nextLine();
        System.out.println("Nhập ngày sinh giảng viên:");
        String teacherDayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính giảng viên:");
        String teachergender = scanner.nextLine();
        System.out.println("Nhập chuyên môn giảng viên:");
        String teacherspecialize = scanner.nextLine();
        Teacher teacher = new Teacher(teacherId, teacherName, teacherDayOfBirth, teachergender, teacherspecialize);
        teacherRepository.addNewTeacher(teacher);
        System.out.println("Thêm mới thành công giảng viên: " + teacher.getName());
    }

    @Override
    public void deleteTeacher() {
        this.dislayTeacherList();
        System.out.println("Nhập id bạn muốn xóa");
        int idTeacherDelete = Integer.parseInt(scanner.nextLine());
        boolean idDelete = teacherRepository.deleteTeacher(idTeacherDelete);
        if (idDelete) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("không tìm thấy id");
        }
    }
}
