package case_study.model;

public class Customer extends Person {
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String identityCard, String numberPhone, String email, String typeOfGuest, String address) {
        super(id, name, dayOfBirth, gender, identityCard, numberPhone, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'';
    }

    public String getInFoToCustomer() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getGender() + "," +
                super.getIdentityCard() + "," + super.getNumberPhone() + "," + super.getEmail() + "," + getTypeOfGuest() + "," + getAddress();
    }
}
