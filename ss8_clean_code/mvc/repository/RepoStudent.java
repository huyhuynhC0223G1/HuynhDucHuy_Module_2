package ss8_clean_code.mvc.repository;

import ss8_clean_code.mvc.model.Student;

public class RepoStudent implements IRepoStudent {
    private static Student[] students;

    static {
        students = new Student[5];
        Student s = new Student("Kiệt", "Kiệt@gmail.com");
        Student s2 = new Student("Quốc", "Quốc@gmail.com");
        Student s3 = new Student("Tài", "Tài@gmail.com");
        students[0] = s;
        students[1] = s2;
        students[2] = s3;
    }

    @Override
    public void showListStudent() {
        for (Student s : students) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }


}
