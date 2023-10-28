package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.ultils.ReadAndWriteFileHouse;
import case_study.ultils.ReadAndWriteFileRoom;
import case_study.ultils.ReadAndWriteFileVilla;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private Map<House, Integer> houseList = new HashMap<>();
    private Map<Room, Integer> roomList = new HashMap<>();
    private Map<Villa, Integer> villaList = new HashMap<>();
    private ReadAndWriteFileVilla readAndWriteFileVilla = new ReadAndWriteFileVilla();
    private String HOUSE_FILE_PATH = "src/case_study/data/house.csv";
    private String ROOM_FILE_PATH = "src/case_study/data/room.csv";
    private String VILLA_FILE_PATH = "src/case_study/data/villa.csv";

    @Override
    public Map<House, Integer> showHouse() {
        houseList = ReadAndWriteFileHouse.readHouseListFromFile(HOUSE_FILE_PATH);
        return houseList;
    }

    @Override
    public Map<Room, Integer> showRoom() {
        roomList = ReadAndWriteFileRoom.readRoomListFromFile(ROOM_FILE_PATH);
        return roomList;
    }

    @Override
    public Map<Villa, Integer> showVilla() {
        villaList = readAndWriteFileVilla.readVillaListToFile(VILLA_FILE_PATH);
        return villaList;
    }

    @Override
    public void addNewHouse(House house, int value) {
        houseList = ReadAndWriteFileHouse.readHouseListFromFile(HOUSE_FILE_PATH);
        houseList.put(house, value + 1);
        ReadAndWriteFileHouse.writeHouseListToFile(houseList, HOUSE_FILE_PATH);
    }

    @Override
    public void addNewRoom(Room room) {
        roomList = ReadAndWriteFileRoom.readRoomListFromFile(ROOM_FILE_PATH);
        roomList.put(room, 0);
        ReadAndWriteFileRoom.writeRoomListToFile(roomList, ROOM_FILE_PATH);
    }

    @Override
    public void addNewVilla(Villa villa) {
        villaList = ReadAndWriteFileVilla.readVillaListToFile(VILLA_FILE_PATH);
        villaList.put(villa, 0);
        ReadAndWriteFileVilla.writeVillaListToFile(villaList, VILLA_FILE_PATH);
    }

    @Override
    public void displayListFacilityMaintenance() {
        Set<Villa> villaSet = villaList.keySet();
        for (Villa v : villaSet) {
            if (villaList.get(v) >= 5) {
                System.out.println(v);
            }
        }
        Set<House> houseSet = houseList.keySet();
        for (House h : houseSet) {
            if (houseList.get(h) >= 5) {
                System.out.println(h);
            }
        }
        Set<Room> roomSet = roomList.keySet();
        for (Room r : roomSet) {
            if (roomList.get(r) >= 5) {
                System.out.println(r);
            }
        }
    }
}
