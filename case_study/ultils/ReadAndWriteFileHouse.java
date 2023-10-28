package case_study.ultils;

import case_study.model.House;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileHouse {
    public static void writeHouseListToFile(Map<House, Integer> houseIntegerMap, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houseSet = houseIntegerMap.keySet();
            for (House s : houseSet) {
                bufferedWriter.write(s.getInToCsv() + "," + houseIntegerMap.get(s));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<House, Integer> readHouseListFromFile(String path) {
        Map<House, Integer> houseIntegerMap = new HashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] houseArr = line.split(",");
                House house = new House(houseArr[0], houseArr[1], houseArr[2], Integer.parseInt(houseArr[3]),
                        Integer.parseInt(houseArr[4]), houseArr[5], houseArr[6], Integer.parseInt(houseArr[7]));
                int value = Integer.parseInt(houseArr[8]);
                houseIntegerMap.put(house, value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return houseIntegerMap;
    }
}
