package case_study.model;

public class Room extends Facility {
    private String freeServiceIncluded;


    public Room(String code, String nameService, String usableErea, int tax, int numberPeople, String rentalType,
                String freeServiceIncluded) {
        super(code, nameService, usableErea, tax, numberPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room" + super.toString()+
                "freeServiceIncluded='" + freeServiceIncluded;
    }

    public String getInToCsv() {
        return super.getCode() + "," + super.getNameService() + "," + super.getUsableErea() + "," + super.getTax() + "," +
                super.getNumberPeople() + "," + super.getRentalType() + "," + getFreeServiceIncluded();
    }
}
