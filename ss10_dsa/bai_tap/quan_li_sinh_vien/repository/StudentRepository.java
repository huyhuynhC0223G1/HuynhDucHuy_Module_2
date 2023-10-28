package ss10_dsa.bai_tap.quan_li_sinh_vien.repository;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Student;
import ss10_dsa.bai_tap.quan_li_sinh_vien.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    //    Mã, tên, ngày sinh, giới tính, lớp, điểm số
    private static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Huy", "25/07/1997", "Nam", "C02", 60));
        students.add(new Student(1, "Sang", "01/01/1998", "Nam", "C02", 90));
        students.add(new Student(1, "Thanh", "02/02/2000", "Nữ", "C02", 95));
    }

    @Override
    public List<Student> getStudentList() {
        return students;
    }

    @Override
    public void addNewStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }
}
