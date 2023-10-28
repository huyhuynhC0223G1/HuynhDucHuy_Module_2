package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.ultils.PersonValidate;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    PersonValidate personValidate = new PersonValidate();

    @Override
    public void dislay() {
        List<Customer> customerList = customerRepository.showCustomer();
        for (Customer s : customerList) {
            System.out.println(s);
        }
    }

    @Override
    public void addCustomer() {
        String idCustomer;
        do {
            System.out.println("Nhập id khách hàng: KH-yyyy ");
            idCustomer = scanner.nextLine();
        } while (!PersonValidate.checkCustomerId(idCustomer));
        String nameCustomer;
        do {
            System.out.println("Nhập tên khách hàng: ");
            nameCustomer = scanner.nextLine();
        } while (!PersonValidate.checkName(nameCustomer));
        String dayOfBirthCustomer;
        boolean checkDateOfBirth = false;
        do {
            System.out.println("Nhập ngày sinh khách hàng: ");
            dayOfBirthCustomer = scanner.nextLine();
            if (personValidate.checkDateOfBirth(dayOfBirthCustomer)) {
                LocalDate dayOfBirth = LocalDate.parse(dayOfBirthCustomer);
                LocalDate now = LocalDate.now();
                if (Period.between(dayOfBirth, now).getYears() >= 18) {
                    System.out.println(" Nhập thành công: ");
                    checkDateOfBirth = false;
                } else {
                    System.out.println("Nhập sai tuổi, mời bạn  nhập lại.");
                    checkDateOfBirth = true;
                }
            }
        } while (checkDateOfBirth);

        System.out.println("Nhập giới tính khách hàng: \n" +
                "1.Nam\n" +
                "2.Nữ");
        String genderCustomer = scanner.nextLine();
        if (genderCustomer.trim().equals("1")) {
            genderCustomer = "Nam";
        }
        if (genderCustomer.trim().equals("2")) {
            genderCustomer = "Nữ";
        }

        String identityCardCustomer;
        do {
            System.out.println("Nhập số CMND khách hàng: ");
            identityCardCustomer = scanner.nextLine();
        } while (!PersonValidate.checkIdentityCard(identityCardCustomer));

        String numberPhoneCustomer;
        do {
            System.out.println("Nhập số điện thoại khách hàng: ");
            numberPhoneCustomer = scanner.nextLine();
        } while (!PersonValidate.checkNumberPhone(numberPhoneCustomer));

        System.out.println("Nhập email khách hàng: ");
        String emailCustomer = scanner.nextLine();

        System.out.println("Nhập loại khách hàng: \n" +
                "1.Diamod\n" +
                "2.Platium\n" +
                "3.Gold\n" +
                "4.Silver\n" +
                "5.Member");
        String typeOfGuestCustomer = null;
        boolean flag = true;
        do {
            String choiceType = scanner.nextLine();

            switch (choiceType) {
                case "1":
                    flag = false;
                    typeOfGuestCustomer = "Diamod";
                    break;
                case "2":
                    flag = false;
                    typeOfGuestCustomer = "Platium";
                    break;
                case "3":
                    flag = false;
                    typeOfGuestCustomer = "Gold";
                    break;
                case "4":
                    flag = false;
                    typeOfGuestCustomer = "Silver";
                    break;
                case "5":
                    flag = false;
                    typeOfGuestCustomer = "Member";
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        } while (flag);
        System.out.println("Nhập địa chỉ khách hàng: ");
        String addressCustomer = scanner.nextLine();
        Customer customer = new Customer(idCustomer, nameCustomer, dayOfBirthCustomer, genderCustomer, identityCardCustomer, numberPhoneCustomer, emailCustomer, typeOfGuestCustomer, addressCustomer);
        customerRepository.addNewCustomer(customer);
        System.out.println("Nhập thành công khách hàng " + customer.getName());
    }

    @Override
    public void editCustumer() {
        System.out.println("Nhập id khách hàng cần sửa:");
        String idEdit = scanner.nextLine();
        List<Customer> customers = customerRepository.showCustomer();
        int checkId = customerRepository.checkCustomerId(idEdit);
        if (checkId >= 0) {
            boolean flag = false;
            Customer customer = customers.get(checkId);
            do {
                System.out.println("Chọn thông tin cần sữa của khách hàng.\n" +
                        "1.Tên khách hàng\n" +
                        "2.Ngày sinh khách hàng\n" +
                        "3.Giới tính khách hàng\n" +
                        "4.Số CMNH khách hàng\n" +
                        "5.Số điện khách hàng\n" +
                        "6.Email khách hàng\n" +
                        "7.Loại khách hàng\n" +
                        "8.Địa chỉ khách hàng\n" +
                        "9.Thoát");

                String choiceEdit = scanner.nextLine();
                switch (choiceEdit) {
                    case "1":
                        String editnameCustomer;
                        do {
                            System.out.println("Nhập tên khách hàng: ");
                            editnameCustomer = scanner.nextLine();
                            customer.setName(editnameCustomer);
                        } while (!PersonValidate.checkName(editnameCustomer));
                        break;
                    case "2":

                        String dayOfBirthCustomer;
                        boolean checkDateOfBirth = false;
                        do {
                            System.out.println("Nhập ngày sinh khách hàng: ");
                            dayOfBirthCustomer = scanner.nextLine();
                            if (personValidate.checkDateOfBirth(dayOfBirthCustomer)) {
                                LocalDate dayOfBirth = LocalDate.parse(dayOfBirthCustomer);
                                LocalDate now = LocalDate.now();
                                if (Period.between(dayOfBirth, now).getYears() >= 18) {
                                    System.out.println(" Nhập thành công: ");
                                    checkDateOfBirth = false;
                                } else {
                                    System.out.println("Nhập sai tuổi, mời bạn  nhập lại.");
                                    checkDateOfBirth = true;
                                }
                            }
                        } while (checkDateOfBirth);
                        customer.setDayOfBirth(dayOfBirthCustomer);
                        break;
                    case "3":

                        System.out.println("Nhập giới tính khách hàng: \n" +
                                "1.Nam\n" +
                                "2.Nữ");
                        String editGenderCustomer = null;
                        String checkGender = scanner.nextLine();
                        if (checkGender.trim().equals("1")) {
                            editGenderCustomer = "Nam";
                        } else if (checkGender.trim().equals("2")) {
                            editGenderCustomer = "Nữ";
                        }
                        customer.setGender(editGenderCustomer);
                        break;
                    case "4":

                        String editIdentityCardCustomer;
                        do {
                            System.out.println("Nhập số CMND khách hàng: ");
                            editIdentityCardCustomer = scanner.nextLine();
                            customer.setIdentityCard(editIdentityCardCustomer);
                        } while (!PersonValidate.checkIdentityCard(editIdentityCardCustomer));
                        break;
                    case "5":

                        String numberPhoneCustomer;
                        do {
                            System.out.println("Nhập số điện thoại khách hàng: ");
                            numberPhoneCustomer = scanner.nextLine();
                            customer.setNumberPhone(numberPhoneCustomer);
                        } while (!PersonValidate.checkNumberPhone(numberPhoneCustomer));
                        break;
                    case "6":

                        System.out.println("Nhập email khách hàng: ");
                        String emailCustomer = scanner.nextLine();
                        customer.setEmail(emailCustomer);
                        break;
                    case "7":

                        System.out.println("Nhập loại khách hàng: \n" +
                                "1.Diamod\n" +
                                "2.Platium\n" +
                                "3.Gold\n" +
                                "4.Silver\n" +
                                "5.Member");
                        String typeOfGuestCustomer = null;
                        boolean flagType = true;
                        do {
                            String choiceType = scanner.nextLine();

                            switch (choiceType) {
                                case "1":
                                    flagType = false;
                                    typeOfGuestCustomer = "Diamod";
                                    break;
                                case "2":
                                    flagType = false;
                                    typeOfGuestCustomer = "Platium";
                                    break;
                                case "3":
                                    flagType = false;
                                    typeOfGuestCustomer = "Gold";
                                    break;
                                case "4":
                                    flagType = false;
                                    typeOfGuestCustomer = "Silver";
                                    break;
                                case "5":
                                    flagType = false;
                                    typeOfGuestCustomer = "Member";
                                    break;
                                default:
                                    System.out.println("Mời bạn nhập lại");
                            }
                        } while (flagType);
                        customer.setTypeOfGuest(typeOfGuestCustomer);
                        break;
                    case "8":

                        System.out.println("Nhập địa chỉ khách hàng: ");
                        String addressCustomer = scanner.nextLine();
                        customer.setAddress(addressCustomer);
                        break;
                    case "9":
                        flag = false;
                        break;
                    default:
                        System.out.println("Mời bạn chọn lại");
                }
            } while (flag);
            customerRepository.editCustomer(idEdit, customer);
        } else {
            System.out.println("Không tìm thấy khách hàng.");
        }
    }
}
