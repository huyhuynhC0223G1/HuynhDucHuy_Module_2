package ss10_dsa.bai_tap.quan_li_sinh_vien.repository;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();

    void addNewStudent(Student student);

    boolean deleteStudent(int id);
}
