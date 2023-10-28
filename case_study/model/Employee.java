package case_study.model;

public class Employee extends Person {
    private String level;
    private String location;

    private String wage;

    public Employee() {
    }

    public Employee(String id, String name, String dayOfBirth, String gender, String identityCard, String numberPhone,
                    String email, String level, String location, String wage) {
        super(id, name, dayOfBirth, gender, identityCard, numberPhone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' ;
    }

    public String getInfoToEmployeeCsv() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getGender() + "," + super.getIdentityCard() + "," + super.getNumberPhone() + "," + super.getEmail() + "," + level + "," + location + "," + wage;
    }
}


