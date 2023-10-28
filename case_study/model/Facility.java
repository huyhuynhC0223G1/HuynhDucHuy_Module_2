package case_study.model;

public abstract class Facility {
    //    Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
    private String code;
    private String nameService;
    private String usableErea;
    private int tax;
    private int numberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String code, String nameService, String usableErea, int tax, int numberPeople, String rentalType) {
        this.code = code;
        this.nameService = nameService;
        this.usableErea = usableErea;
        this.tax = tax;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUsableErea() {
        return usableErea;
    }

    public void setUsableErea(String usableErea) {
        this.usableErea = usableErea;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "code='" + code + '\'' +
                ", nameService='" + nameService + '\'' +
                ", erea='" + usableErea + '\'' +
                ", tax='" + tax + '\'' +
                ", numberPeople='" + numberPeople + '\'' +
                ", rentalType='" + rentalType + '\'';
    }
}
