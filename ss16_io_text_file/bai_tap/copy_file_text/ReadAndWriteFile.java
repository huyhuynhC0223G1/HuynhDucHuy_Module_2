package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ReadAndWriteFile {
    final String PATH_SOURCE_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/source.txt";
    final String PATH_TARGET_FILE = "src/ss16_io_text_file/bai_tap/copy_file_text/target.txt";

    public List<Integer> readFile(String sourceFile) {
        List<Integer> arr = new ArrayList<>();
        File file = new File(sourceFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int count = 0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                arr.add((Integer.parseInt(temp)));
                count += temp.length();
            }
            arr.add(Integer.valueOf(count));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Không tồn tại file hoặc nội dung bị lỗi");
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arr;
    }


    public void writeFile(String targetFile, List<Integer> arr) {
        File file1 = new File(this.PATH_TARGET_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file1, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < arr.size(); i++) {
                bufferedWriter.write("" + arr.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
