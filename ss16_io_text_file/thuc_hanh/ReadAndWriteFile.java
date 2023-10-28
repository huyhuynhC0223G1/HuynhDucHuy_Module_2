package ss16_io_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    String filePath = "src/ss16_io_text_file/thuc_hanh/data";

    public List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Không tồn tại file hoặc nội dung bị lỗi");
        }
        return list;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Max = " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
