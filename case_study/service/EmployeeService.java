package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.ultils.PersonValidate;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    PersonValidate personValidate = new PersonValidate();

    @Override
    public void dislay() {
        List<Employee> employeeList = employeeRepository.showEmployee();
        for (Employee s : employeeList) {
            System.out.println(s);
        }
    }

    //2.Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    @Override
    public void addNewStaff() {
        String idStaff;
        boolean checkEmployeeId = false;
        do {
            System.out.println("Nhập id nhân viên: NV-YYYY");
            idStaff = scanner.nextLine();
            if (employeeRepository.checkEmployee(idStaff) != -1) {
                System.out.println("ID Đã tồn tại");
                checkEmployeeId = true;
            } else if (!PersonValidate.checkEmployeeId(idStaff)) {
                System.err.println("Không đúng định dạng: NV-YYYY. ( Y là số)");
            }
        } while (checkEmployeeId && !PersonValidate.checkEmployeeId(idStaff));
        String nameStaff;
        do {
            System.out.println("Nhập tên nhân viên:");
            nameStaff = scanner.nextLine();
        } while (!PersonValidate.checkName(nameStaff));
        String dayOfBirthStaff;
        boolean checkDateOfBirth = false;
        do {
            System.out.println("Nhập ngày sinh nhân viên:");
            dayOfBirthStaff = scanner.nextLine();
            if (personValidate.checkDateOfBirth(dayOfBirthStaff)) {
                LocalDate dayOfBirth = LocalDate.parse(dayOfBirthStaff);
                LocalDate now = LocalDate.now();
                if (Period.between(dayOfBirth, now).getYears() >= 18) {
                    System.out.println("Nhập thành công");
                    checkDateOfBirth = false;
                } else {
                    System.out.println("chưa đủ 18 tuổi\n" +
                            "chọn 1 để nhập lại nếu sai sót\n" +
                            "chọn khác 1 để thoát\n");
                    String choice = scanner.nextLine();
                    if (choice.equals("1")) {
                        checkDateOfBirth = true;
                    } else {
                        return;
                    }
                }
            } else {
                System.out.println("nhập sai định dạng, mời nhập lại");
                checkDateOfBirth = true;
            }
        } while (checkDateOfBirth);

        System.out.println("Chọn giới tính nhân viên: \n" +
                "1. Nam\n" +
                "2. Nữ");
        String choice = scanner.nextLine();
        String genderStaff = null;
        if (choice.trim().equals("1")) {
            genderStaff = "Nam";
        } else if (choice.trim().equals("2")) {
            genderStaff = "Nữ";
        }
        String identityCardStaff;
        do {
            System.out.println("Nhập số CMNH nhân viên:");
            identityCardStaff = scanner.nextLine();
        } while (!PersonValidate.checkIdentityCard(identityCardStaff));
        String numberphoneStaff;
        do {
            System.out.println("Nhập số điện thoại nhân viên:");
            numberphoneStaff = scanner.nextLine();
        } while (!PersonValidate.checkNumberPhone(numberphoneStaff));

        System.out.println("Nhập email nhân viên:");
        String emailStaff = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên:\n" +
                "1.Trung cấp.\n" +
                "2.Cao đẳng.\n" +
                "3.Đại học\n" +
                "4.Sau đại học");

        String levelStaff = null;
        boolean flag = true;
        do {
            String choiceLevel = scanner.nextLine();
            switch (choiceLevel) {
                case "1":
                    flag = false;
                    levelStaff = "Trung cấp";
                    break;
                case "2":
                    flag = false;
                    levelStaff = "Cao đẳng";
                    break;
                case "3":
                    flag = false;
                    levelStaff = "Đại học";
                    break;
                case "4":
                    flag = false;
                    levelStaff = "Sau đại học";
                    break;
                default:
                    System.out.println("mời bạn chọn lại.");
            }
        } while (flag);

        System.out.println("Nhập vị trí nhân viên:\n" +
                "1.Lễ tân\n" +
                "2.Phục vụ\n" +
                "3.Chuyên viên\n" +
                "4.Giám sát\n" +
                "5.Quản lý\n" +
                "6.Giám đốc");
        String locationStaff = null;
        do {
            String choiceLocation = scanner.nextLine();
            switch (choiceLocation) {
                case "1":
                    flag = false;
                    locationStaff = "Lễ tân";
                    break;
                case "2":
                    flag = false;
                    locationStaff = "Phục vụ";
                    break;
                case "3":
                    flag = false;
                    locationStaff = "Chuyên viên";
                    break;
                case "4":
                    flag = false;
                    locationStaff = "Giám sát";
                    break;
                case "5":
                    flag = false;
                    locationStaff = "Quản lý";
                    break;
                case "6":
                    flag = false;
                    locationStaff = "Giám đốc";
                    break;
            }
        } while (flag);
        String wageStaff;
        do {
            System.out.println("Nhập lương nhân viên:");
            wageStaff = scanner.nextLine();
        } while (!PersonValidate.checkEmployeeWage(wageStaff));
        Employee newemployee = new Employee(idStaff, nameStaff, dayOfBirthStaff, genderStaff, identityCardStaff, numberphoneStaff, emailStaff, levelStaff, locationStaff, wageStaff);
        employeeRepository.addEmployyeStaff(newemployee);
        System.out.println("Thêm mới nhân viên thành công " + newemployee.getName());
    }

    @Override
    public void editStaff() {
        System.out.println("Mời bạn nhập id cần sửa: NV-YYYY");
        String idStaff = scanner.nextLine();
        List<Employee> employees = employeeRepository.showEmployee();
        int checkidedit = employeeRepository.checkEmployee(idStaff);
        if (checkidedit >= 0) {
            boolean flag = true;
            Employee employee = employees.get(checkidedit);
            do {
                System.out.println("Mời bạn chọn thông tin cần sửa:\n" +
                        "1.Tên nhân viên\n" +
                        "2.Ngày sinh nhân viên\n" +
                        "3.Giới tính nhân viên\n" +
                        "4.Số CMNH nhân viên\n" +
                        "5.Số điện thoại nhân viên\n" +
                        "6.Email nhân viên\n" +
                        "7.Trình độ nhân viên\n" +
                        "8.Vị trí nhân viên\n" +
                        "9.Lương nhân viên\n" +
                        "10.Exit\n");
                String choiedit = scanner.nextLine();
                switch (choiedit) {
                    case "1":
                        String editNameStaff;
                        do {
                            System.out.println("Nhập tên nhân viên:");
                            editNameStaff = scanner.nextLine();
                            employee.setName(editNameStaff);
                        } while (!PersonValidate.checkName(editNameStaff));
                        break;
                    case "2":
                        String editDayOfBirthStaff;
                        boolean checkDateOfBirth;
                        do {
                            System.out.println("Nhập ngày sinh nhân viên:");
                            editDayOfBirthStaff = scanner.nextLine();
                            if (personValidate.checkDateOfBirth(editDayOfBirthStaff)) {
                                LocalDate dayOfBirth = LocalDate.parse(editDayOfBirthStaff);
                                LocalDate now = LocalDate.now();
                                if (Period.between(dayOfBirth, now).getYears() >= 18) {
                                    System.out.println("Nhập thành công");
                                    checkDateOfBirth = false;
                                } else {
                                    System.out.println("chưa đủ 18 tuổi\n" +
                                            "1. để nhập lại nếu sai sót\n" +
                                            "Chọn khác 1 để thoát\n");
                                    String choice = scanner.nextLine();
                                    if (choice.equals("1")) {
                                        checkDateOfBirth = true;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                System.out.println("nhập sai định dạng, mời nhập lại");
                                checkDateOfBirth = true;
                            }
                        } while (checkDateOfBirth);
                        employee.setDayOfBirth(editDayOfBirthStaff);
                        break;
                    case "3":
                        System.out.println("Chọn giới tính nhân viên:\n" +
                                "1. Nam\n" +
                                "2. Nữ");
                        String choice = scanner.nextLine();
                        String editGenderStaff = null;
                        if (choice.trim().equals("1")) {
                            editGenderStaff = "Nam";
                        } else if (choice.trim().equals("2")) {
                            editGenderStaff = "Nữ";
                        }
                        employee.setGender(editGenderStaff);
                        break;
                    case "4":
                        String editIdentityCardStaff;
                        do {
                            System.out.println("Nhập số CMNH nhân viên:");
                            editIdentityCardStaff = scanner.nextLine();
                            employee.setIdentityCard(editIdentityCardStaff);
                        } while (!PersonValidate.checkIdentityCard(editIdentityCardStaff));
                        break;
                    case "5":
                        String editNumberphoneStaff;
                        do {
                            System.out.println("Nhập số điện thoại nhân viên:");
                            editNumberphoneStaff = scanner.nextLine();
                            employee.setNumberPhone(editNumberphoneStaff);
                        } while (!PersonValidate.checkNumberPhone(editNumberphoneStaff));
                        break;
                    case "6":
                        System.out.println("Nhập email nhân viên:");
                        String editEmailStaff = scanner.nextLine();
                        employee.setEmail(editEmailStaff);
                        break;
                    case "7":
                        System.out.println("Nhập trình độ nhân viên:\n" +
                                "1.Trung cấp.\n" +
                                "2.Cao đẳng.\n" +
                                "3.Đại học\n" +
                                "4.Sau đại học");

                        String editLevelStaff = null;
                        boolean flagedit = true;
                        do {
                            String choiceLevel = scanner.nextLine();
                            switch (choiceLevel) {
                                case "1":
                                    flagedit = false;
                                    editLevelStaff = "Trung cấp";
                                    break;
                                case "2":
                                    flagedit = false;
                                    editLevelStaff = "Cao đẳng";
                                    break;
                                case "3":
                                    flagedit = false;
                                    editLevelStaff = "Đại học";
                                    break;
                                case "4":
                                    flagedit = false;
                                    editLevelStaff = "Sau đại học";
                                    break;
                                default:
                                    System.out.println("mời bạn chọn lại.");
                            }
                        } while (flagedit);
                        employee.setLevel(editLevelStaff);
                        break;
                    case "8":
                        boolean flageditloca = true;
                        System.out.println("Nhập vị trí nhân viên:\n" +
                                "1.Lễ tân\n" +
                                "2.Phục vụ\n" +
                                "3.Chuyên viên\n" +
                                "4.Giám sát\n" +
                                "5.Quản lý\n" +
                                "6.Giám đốc");
                        String editLocationStaff = null;
                        do {
                            String choiceLocation = scanner.nextLine();
                            switch (choiceLocation) {
                                case "1":
                                    flageditloca = false;
                                    editLocationStaff = "Lễ tân";
                                    break;
                                case "2":
                                    flageditloca = false;
                                    editLocationStaff = "Phục vụ";
                                    break;
                                case "3":
                                    flageditloca = false;
                                    editLocationStaff = "Chuyên viên";
                                    break;
                                case "4":
                                    flageditloca = false;
                                    editLocationStaff = "Giám sát";
                                    break;
                                case "5":
                                    flageditloca = false;
                                    editLocationStaff = "Quản lý";
                                    break;
                                case "6":
                                    flageditloca = false;
                                    editLocationStaff = "Giám đốc";
                                    break;
                                default:
                                    System.out.println("Mời bạn chọn lại.");
                            }
                        } while (flageditloca);
                        employee.setLocation(editLocationStaff);
                        break;
                    case "9":
                        String editWageStaff;
                        do {
                            System.out.println("Nhập lương nhân viên:");
                            editWageStaff = scanner.nextLine();
                        } while (!PersonValidate.checkEmployeeWage(editWageStaff));
                        employee.setWage(editWageStaff);
                        break;
                    case "10":
                        flag = false;
                        break;
                }
            } while (flag);
            employeeRepository.editEmployeeStaff(idStaff, employee);
        } else {
            System.out.println("Không tìm thấy nhân viên cần sửa");
        }
        this.dislay();
    }
}


