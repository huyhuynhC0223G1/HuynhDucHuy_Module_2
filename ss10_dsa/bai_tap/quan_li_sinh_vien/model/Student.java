package ss10_dsa.bai_tap.quan_li_sinh_vien.model;

public class Student extends Person {
    private String classes;
    private int point;

    public Student() {
    }

    public Student(int iD, String name, String dayOfBirth, String gender, String classes, int point) {
        super(iD, name, dayOfBirth, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: " +
                "iD= " + getiD() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", classes='" + classes + '\'' +
                ", point=" + point;

    }
}
