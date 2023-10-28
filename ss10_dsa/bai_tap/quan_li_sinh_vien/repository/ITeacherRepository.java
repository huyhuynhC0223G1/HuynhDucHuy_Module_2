package ss10_dsa.bai_tap.quan_li_sinh_vien.repository;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();

    void addNewTeacher(Teacher teacher);

    boolean deleteTeacher(int id);
}
