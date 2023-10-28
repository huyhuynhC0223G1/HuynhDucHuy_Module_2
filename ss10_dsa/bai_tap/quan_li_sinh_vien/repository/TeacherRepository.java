package ss10_dsa.bai_tap.quan_li_sinh_vien.repository;

import ss10_dsa.bai_tap.quan_li_sinh_vien.model.Teacher;
import ss10_dsa.bai_tap.quan_li_sinh_vien.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher(1, "Trungtv", "10/10/1996", "Nam", "tutor"));
        teachers.add(new Teacher(1, "Công", "10/10/1990", "Nam", "tutor"));
        teachers.add(new Teacher(1, "Chánh", "10/10/1985", "Nam", "tutor"));
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teachers;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public boolean deleteTeacher(int id) {
        return false;
    }

}
