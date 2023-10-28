package case_study.ultils;

import case_study.model.Villa;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFileVilla {
    public static void writeVillaListToFile(Map<Villa, Integer> villaIntegerMap, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villaSet = villaIntegerMap.keySet();
            for (Villa v : villaSet) {
                bufferedWriter.write(v.getInToCsv() + "," + villaIntegerMap.get(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<Villa, Integer> readVillaListToFile(String path) {
        Map<Villa, Integer> villaIntegerMap = new HashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] villaArr = line.split(",");
                Villa villa = new Villa(villaArr[0], villaArr[1], villaArr[2], Integer.parseInt(villaArr[3]),
                        Integer.parseInt(villaArr[4]), villaArr[5], villaArr[6], villaArr[7], Integer.parseInt(villaArr[8]));
                int value = Integer.parseInt(villaArr[9]);
                villaIntegerMap.put(villa, value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return villaIntegerMap;
    }
}
