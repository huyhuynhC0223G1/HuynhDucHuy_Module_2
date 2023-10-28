package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String code, String nameService, String usableErea, int tax, int numberPeople, String rentalType,
                 String roomStandard, int numberOfFloors) {
        super(code, nameService, usableErea, tax, numberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors;
    }

    public String getInToCsv() {
        return super.getCode() + "," + super.getNameService() + "," + super.getUsableErea() + "," + super.getTax() + "," +
                super.getNumberPeople() + "," + super.getRentalType() + "," + getRoomStandard() + "," + getNumberOfFloors();
    }
}