package ss10_dsa.bai_tap.quan_li_sinh_vien.model;

public class Person {
    //    Mã, tên, ngày sinh, giới tính, lớp, điểm số
    private int iD;
    private String name;
    private String dayOfBirth;
    private String gender;

    public Person() {
    }

    public Person(int iD, String name, String dayOfBirth, String gender) {
        this.iD = iD;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person: " +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'';
    }
}
