package ss10_dsa.bai_tap.quan_li_sinh_vien.service;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Student;
import ss10_dsa.bai_tap.quan_li_sinh_vien.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();
    // nhan cac thong tin cua student, khoi tao doi tuong student,
    // goi repo de luu vao

    @Override
    public void dislayStudentList() {
        List<Student> studentList = studentRepository.getStudentList();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập ID học sinh:");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học sinh:");
        String studentname = scanner.nextLine();
        System.out.println("nhập ngày sinh học sinh");
        String studentDayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính học sinh:");
        String studentgender = scanner.nextLine();
        System.out.println("Nhập lớp học sinh:");
        String studentclasses = scanner.nextLine();
        System.out.println("Nhập điểm học sinh:");
        int studentpoint = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(studentId, studentname, studentDayOfBirth, studentgender, studentclasses, studentpoint);
        studentRepository.addNewStudent(newStudent);
        System.out.println("Thêm mới thành công hoc viên: " + newStudent.getName());
    }

    @Override
    public void deleteStudent() {
        this.dislayStudentList();
        System.out.println("Nhập id bạn muốn xóa");
        int idStudentDelete = Integer.parseInt(scanner.nextLine());
        boolean idDelete = studentRepository.deleteStudent(idStudentDelete);
        if (idDelete) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy id");
        }
    }
}
