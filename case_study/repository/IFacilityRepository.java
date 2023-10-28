package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.Map;

public interface IFacilityRepository {
    Map<House, Integer> showHouse();
    Map<Room, Integer> showRoom();
    Map<Villa, Integer> showVilla();

    void addNewHouse(House house, int value);
    void addNewRoom(Room room);
    void addNewVilla(Villa villa);
    void displayListFacilityMaintenance();
}
