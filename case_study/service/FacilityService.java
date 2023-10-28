package case_study.service;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.ultils.FacilityValidate;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    private FacilityRepository facilityRepository = new FacilityRepository();
    private FacilityValidate facilityValidate = new FacilityValidate();

    @Override
    public void dislay() {
        boolean flag = false;
        do {
            System.out.print("Danh sách dịch vụ :\n" +
                    "1.House\n" +
                    "2.Room\n" +
                    "3.Villa\n" +
                    "Mời bạn chọn danh sách hiển thị: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    Map<House, Integer> houseList = facilityRepository.showHouse();
                    Set<House> houseSet = houseList.keySet();
                    for (House h : houseSet) {
                        System.out.println(h + "-" + houseList.get(h) + " số lần sử dụng");
                    }
                    break;
                case "2":
                    Map<Room, Integer> roomList = facilityRepository.showRoom();
                    Set<Room> roomSet = roomList.keySet();
                    for (Room r : roomSet) {
                        System.out.println(r + "-" + roomList.get(r) + "số lần sử dụng");
                    }
                    break;
                case "3":
                    Map<Villa, Integer> villaList = facilityRepository.showVilla();
                    Set<Villa> villaSet = villaList.keySet();
                    for (Villa v : villaSet) {
                        System.out.println(v + "-" + villaList.get(v) + "số lần sử dụng");
                    }
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng");

            }
        } while (flag);
    }

    // Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
//    usableErea, String tax, String numberPeople, String rentalType, String roomStandard, String numberOfFloors
    @Override
    public void addNewHouse() {
        String codeHouse;
        do {
            System.out.print("Nhập mã dịch vụ: SVHO-YYYY ");
            codeHouse = scanner.nextLine();
            if (!facilityValidate.checkHouseCode(codeHouse)) {
                System.err.println("Sai định dạng");
            }
        } while (!facilityValidate.checkHouseCode(codeHouse));
        String nameHouse;
        do {
            System.out.print("Nhập tên dịch vụ ");
            nameHouse = scanner.nextLine();
        } while (!facilityValidate.checkName(nameHouse));
        String usableEreaHouse;
        do {
            System.out.print("Nhập diện tích sử dụng dịch vụ ");
            usableEreaHouse = scanner.nextLine();
        } while (!facilityValidate.checkUsableErea(usableEreaHouse));
        int taxHouse;
        do {
            System.out.print("Nhập chi phí thuế dịch vụ ");
            taxHouse = Integer.parseInt(scanner.nextLine());
        } while (taxHouse < 0);

        int numberPeopleHouse;
        do {
            System.out.print("Nhập số lượng người tối đa dùng dịch vụ ");
            numberPeopleHouse = Integer.parseInt(scanner.nextLine());
        } while (numberPeopleHouse < 0 || numberPeopleHouse > 20);
        String rentalTypeHouse;
        boolean flagType = true;
        do {
            System.out.print("Nhập kiểu thuê dịch vụ\n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ\n");
            rentalTypeHouse = null;
            String choiceType = scanner.nextLine();
            switch (choiceType) {
                case "1":
                    flagType = false;
                    rentalTypeHouse = "Thuê theo năm";
                    break;
                case "2":
                    flagType = false;
                    rentalTypeHouse = " Thuê theo tháng";
                    break;
                case "3":
                    flagType = false;
                    rentalTypeHouse = "Thuê theo ngày";
                    break;
                case "4":
                    flagType = false;
                    rentalTypeHouse = "Thuê theo giờ";
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        } while (flagType);

        String roomStandardHouse;
        do {
            System.out.print("Nhập tiêu chuẩn phòng ");
            roomStandardHouse = scanner.nextLine();
        } while (!facilityValidate.checkName(roomStandardHouse));
        int numberOfFloorsHouse;
        do {

            System.out.print("Nhập số tầng");
            numberOfFloorsHouse = Integer.parseInt(scanner.nextLine());
        } while (numberOfFloorsHouse < 0);
        House newHouse = new House(codeHouse, nameHouse, usableEreaHouse, taxHouse, numberPeopleHouse, rentalTypeHouse,
                roomStandardHouse, numberOfFloorsHouse);
        facilityRepository.addNewHouse(newHouse, 1);
        System.out.println("Thêm mới thành công dịch vụ " + newHouse.getNameService());
    }

    @Override
    public void addNewRoom() {
        String codeRoom;
        do {
            System.out.print("Nhập mã dịch vụ: SVRO-YYYY ");
            codeRoom = scanner.nextLine();
            if (!facilityValidate.checkRoomCode(codeRoom)) {
                System.err.println("Sai định dạng");
            }
        } while (!facilityValidate.checkRoomCode(codeRoom));
        String nameRoom;
        do {
            System.out.print("Nhập tên dịch vụ ");
            nameRoom = scanner.nextLine();
        } while (!facilityValidate.checkName(nameRoom));
        String usableEreaRoom;
        do {
            System.out.print("Nhập diện tích sử dụng dịch vụ ");
            usableEreaRoom = scanner.nextLine();
        } while (!facilityValidate.checkUsableErea(usableEreaRoom));
        int taxRoom;
        do {
            System.out.print("Nhập chi phí thuế dịch vụ ");
            taxRoom = Integer.parseInt(scanner.nextLine());
        } while (taxRoom < 0);

        int numberPeopleRoom;
        do {
            System.out.print("Nhập số lượng người tối đa dùng dịch vụ ");
            numberPeopleRoom = Integer.parseInt(scanner.nextLine());
        } while (numberPeopleRoom < 0 || numberPeopleRoom > 20);
        String rentalTypeRoom;
        boolean flagType = true;
        do {
            System.out.print("Nhập kiểu thuê dịch vụ\n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ\n");
            rentalTypeRoom = null;
            String choiceType = scanner.nextLine();
            switch (choiceType) {
                case "1":
                    flagType = false;
                    rentalTypeRoom = "Thuê theo năm";
                    break;
                case "2":
                    flagType = false;
                    rentalTypeRoom = " Thuê theo tháng";
                    break;
                case "3":
                    flagType = false;
                    rentalTypeRoom = "Thuê theo ngày";
                    break;
                case "4":
                    flagType = false;
                    rentalTypeRoom = "Thuê theo giờ";
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        } while (flagType);
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        String freeServiceIncludedRoom = scanner.nextLine();
        Room newRoom = new Room(codeRoom, nameRoom, usableEreaRoom, taxRoom, numberPeopleRoom, rentalTypeRoom,
                freeServiceIncludedRoom);
        facilityRepository.addNewRoom(newRoom);
        System.out.println("Thêm mới thành công dịch vụ " + newRoom.getNameService());
    }

    @Override
    public void addNewVilla() {
        String codeVilla;
        do {
            System.out.print("Nhập mã dịch vụ: SVVL-YYYY ");
            codeVilla = scanner.nextLine();
            if (!facilityValidate.checkVillaCode(codeVilla)) {
                System.err.println("Sai định dạng");
            }
        } while (!facilityValidate.checkVillaCode(codeVilla));
        String nameVilla;
        do {
            System.out.print("Nhập tên dịch vụ ");
            nameVilla = scanner.nextLine();
        } while (!facilityValidate.checkName(nameVilla));
        String usableEreaVilla;
        do {
            System.out.print("Nhập diện tích sử dụng dịch vụ ");
            usableEreaVilla = scanner.nextLine();
        } while (!facilityValidate.checkUsableErea(usableEreaVilla));
        int taxVilla;
        do {
            System.out.print("Nhập chi phí thuế dịch vụ ");
            taxVilla = Integer.parseInt(scanner.nextLine());
        } while (taxVilla < 0);

        int numberPeopleVilla;
        do {
            System.out.print("Nhập số lượng người tối đa dùng dịch vụ ");
            numberPeopleVilla = Integer.parseInt(scanner.nextLine());
        } while (numberPeopleVilla < 0 || numberPeopleVilla > 20);
        String rentalTypeVilla;
        boolean flagType = true;
        do {
            System.out.print("Nhập kiểu thuê dịch vụ\n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ\n");
            rentalTypeVilla = null;
            String choiceType = scanner.nextLine();
            switch (choiceType) {
                case "1":
                    flagType = false;
                    rentalTypeVilla = "Thuê theo năm";
                    break;
                case "2":
                    flagType = false;
                    rentalTypeVilla = " Thuê theo tháng";
                    break;
                case "3":
                    flagType = false;
                    rentalTypeVilla = "Thuê theo ngày";
                    break;
                case "4":
                    flagType = false;
                    rentalTypeVilla = "Thuê theo giờ";
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        } while (flagType);
        String roomStandardVilla;
        do {
            System.out.print("Nhập tiêu chuẩn phòng ");
            roomStandardVilla = scanner.nextLine();
        } while (!facilityValidate.checkName(roomStandardVilla));
        String poolArea;
        do {
            System.out.println("Nhập diện tích hồ bơi:");
            poolArea = scanner.nextLine();
        } while (!facilityValidate.checkUsableErea(usableEreaVilla));
        int numberOfFloorsVilla;
        do {

            System.out.print("Nhập số tầng");
            numberOfFloorsVilla = Integer.parseInt(scanner.nextLine());
        } while (numberOfFloorsVilla < 0);

        Villa newVilla = new Villa(codeVilla, nameVilla, usableEreaVilla, taxVilla, numberPeopleVilla, rentalTypeVilla,
                roomStandardVilla, poolArea, numberOfFloorsVilla);
        facilityRepository.addNewVilla(newVilla);
        System.out.println("Thêm mới thành công dịch vụ " + newVilla.getNameService());
    }
    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.displayListFacilityMaintenance();
    }
}
