package case_study.model;

public class Villa extends Facility{
//    - Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    private String roomStandard;
    private String poolArea;
    private int numberOfFloors;

    public Villa(String code, String nameService, String usableErea, int tax, int numberPeople, String rentalType, String roomStandard, String poolArea, int numberOfFloors) {
        super(code, nameService, usableErea, tax, numberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors;
    }
    public String getInToCsv() {
        return super.getCode() + "," + super.getNameService() + "," + super.getUsableErea() + "," + super.getTax() + "," +
                super.getNumberPeople() + "," + super.getRentalType() + "," + getRoomStandard() + "," + getPoolArea() +
                "," + getNumberOfFloors();
    }
}
