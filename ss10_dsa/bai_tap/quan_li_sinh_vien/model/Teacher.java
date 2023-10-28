package ss10_dsa.bai_tap.quan_li_sinh_vien.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(int iD, String name, String dayOfBirth, String gender, String specialize) {
        super(iD, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "iD=" + getiD() +
                ", name='" + getName() + '\'' +
                ", dayOfBirth='" + getDayOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                "specialize='" + specialize + '\'';
    }
}
