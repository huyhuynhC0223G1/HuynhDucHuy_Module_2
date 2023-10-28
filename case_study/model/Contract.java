package case_study.model;

public class Contract {
    //    số hợp đồng, mã booking, số tiền cọc trước, tổng số tiền thanh toán.
//    contract number, reservation number, reservation amount, total payment amount.
    private int contractNumber;
    private String idBooking;
    private String reservationAmount;
    private String totalPaymentAmount;

    public Contract() {
    }

    public Contract(int contractNumber, String idBooking, String reservationAmount, String totalPaymentAmount) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.reservationAmount = reservationAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getReservationAmount() {
        return reservationAmount;
    }

    public void setReservationAmount(String reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract:" +
                "contractNumber=" + contractNumber +
                ", idBooking='" + idBooking + '\'' +
                ", reservationAmount='" + reservationAmount + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount;
    }

    public String getToInCsv() {
        return getContractNumber() + "," + getIdBooking() + "," + getReservationAmount() + "," + getTotalPaymentAmount();
    }
}
