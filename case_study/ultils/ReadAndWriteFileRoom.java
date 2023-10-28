package case_study.ultils;

import case_study.model.Room;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileRoom {
    public static void writeRoomListToFile(Map<Room, Integer> roomIntegerMap , String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Room> roomSet = roomIntegerMap.keySet();
            for (Room r : roomSet){
                bufferedWriter.write(r.getInToCsv()+","+roomIntegerMap.get(r));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Map<Room, Integer> readRoomListFromFile(String path){
        Map<Room, Integer> roomIntegerMap = new HashMap<>();
    File file = new File(path);
    try {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line= bufferedReader.readLine())!= null && !line.equals("")){
            String[] roomArr = line.split(",");
            Room room = new Room(roomArr[0],roomArr[1],roomArr[2],Integer.parseInt(roomArr[3]),
                    Integer.parseInt(roomArr[4]),roomArr[5],roomArr[6]);
            int value = Integer.parseInt(roomArr[7]);
            roomIntegerMap.put(room,value);
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        return roomIntegerMap;
    }
}
