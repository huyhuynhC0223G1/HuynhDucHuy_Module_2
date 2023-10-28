package case_study.ultils;

import case_study.model.Contract;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadAndWriteFileContract {
    public static void writeContactListToFile(List<Contract> contracts, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contract c : contracts) {
                bufferedWriter.write(c.getToInCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Contract> readContractListFromFile(String path) {
        List<Contract> contractList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] contractArr = line.split(",");
                Contract contract = new Contract(Integer.parseInt(contractArr[0]), contractArr[1], contractArr[2], contractArr[3]);
                contractList.add(contract);
            }
            bufferedReader.close();
            fileReader.close();
            return contractList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}