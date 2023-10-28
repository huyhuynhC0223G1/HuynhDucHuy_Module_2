package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> a = readAndWriteFile.readFile(readAndWriteFile.filePath);
        int maxvalue = findMax(a);
        readAndWriteFile.writeFile(readAndWriteFile.filePath, maxvalue);
    }

    public static int findMax(List<Integer> lists) {
        int max = lists.get(0);
        for (int i = 0; i < lists.size(); i++) {
            if (max < lists.get(i)) {
                max = lists.get(i);
            }
        }
        return max;
    }
}