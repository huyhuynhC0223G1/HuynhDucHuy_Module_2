package case_study.model;

public class Booking implements Comparable<Booking> {
    //    mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String idBooking;
    private String dayBooking;
    private String rentalStartDate;
    private String leaseEndDate;
    private String customerCode;
    private String serviceCode;

    public Booking() {
    }

    public Booking(String idBooking, String dayBooking, String rentalStartDate, String leaseEndDate, String customerCode, String serviceCode) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.rentalStartDate = rentalStartDate;
        this.leaseEndDate = leaseEndDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getLeaseEndDate() {
        return leaseEndDate;
    }

    public void setLeaseEndDate(String leaseEndDate) {
        this.leaseEndDate = leaseEndDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking:" +
                "idBooking='" + idBooking + '\'' +
                ", dayBooking=" + dayBooking +
                ", rentalStartDate=" + rentalStartDate +
                ", leaseEndDate=" + leaseEndDate +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode;
    }

    public String getToInCsv() {
        return getIdBooking() + "," + getDayBooking() + "," + getRentalStartDate() + "," + getLeaseEndDate() + "," + getCustomerCode() + "," + getServiceCode();
    }

    @Override
    public int compareTo(Booking o) {
        return this.dayBooking.compareTo(o.dayBooking);
    }
}
