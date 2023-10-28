package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.ContactRepository;
import case_study.ultils.BookingValidate;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class ContactService implements IContactService {
    private ContactRepository contactRepository = new ContactRepository();
    private Queue<Booking> bookingQueue = contactRepository.idBooking();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void dislay() {
        List<Contract> contractList = contactRepository.showCotract();
        for (Contract c : contractList) {
            System.out.println(c);
        }
    }

    @Override
    public void addNewContract() {
        if (!bookingQueue.isEmpty()) {
            int contractNumber;
            do {
                System.out.print("Nhập số hợp đồng");
                contractNumber = Integer.parseInt(scanner.nextLine());
            } while (contractNumber < 0);
            for (Booking b : bookingQueue) {
                System.out.println(b);
            }
            String idBooking = bookingQueue.poll().getIdBooking();
            System.out.print("Nhập số tiền cọc trước");
            String reservationAmount = scanner.nextLine();
            System.out.print("Nhập số tiền thanh toán");
            String totalPaymentAmount = scanner.nextLine();
            Contract newcontract = new Contract(contractNumber, idBooking, reservationAmount, totalPaymentAmount);
            contactRepository.addNewContract(newcontract);
            System.out.println("Nhập thành công contract " + newcontract.getContractNumber());
        } else {
            System.out.println("Không tìm thấy booking.");
        }
    }

    @Override
    public void editContract() {
        System.out.println("Mời bạn nhập số hợp đồng cần sửa");
        int editContractNumber = Integer.parseInt(scanner.nextLine());
        List<Contract> contracts = contactRepository.showCotract();
        int checkIdEdit = contactRepository.checkContract(editContractNumber);
        if (checkIdEdit >= 0) {
            boolean flag = true;
            Contract contract = contracts.get(checkIdEdit);
            do {
                System.out.print("Danh sách sửa\n" +
                        "1.Mã booking\n" +
                        "2.Số tiền cọc trước\n" +
                        "3.Số tiền thanh toán\n" +
                        "4.Quay lai menu\n" +
                        "Mời bạn chọn mục muốn sửa: ");
                String choiceedit = scanner.nextLine();
                switch (choiceedit) {
                    case "1":
                        flag = false;
                        String editIdBooking;
                        do {
                            System.out.print("Nhập mã booking");
                            editIdBooking = scanner.nextLine();
                            contract.setIdBooking(editIdBooking);
                        } while (!BookingValidate.checkBookingCode(editIdBooking));
                        break;
                    case "2":
                        flag = false;
                        System.out.print("Nhập số tiền cọc trước");
                        String reservationAmount = scanner.nextLine();
                        contract.setReservationAmount(reservationAmount);
                        break;
                    case "3":
                        flag = false;
                        System.out.print("Nhập số tiền thanh toán");
                        String totalPaymentAmount = scanner.nextLine();
                        contract.setTotalPaymentAmount(totalPaymentAmount);
                        break;
                    case "4":
                        break;
                }
            } while (flag);
            System.out.println("Sửa thành công hợp đồng số: " + editContractNumber);
            System.out.println(contract);
            contactRepository.editContract(editContractNumber, contract);
        } else {
            System.out.println("Không tìm thấy hợp đồng ");
        }
    }
}
