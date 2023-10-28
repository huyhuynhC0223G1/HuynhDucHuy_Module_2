package ss16_io_text_file.thuc_hanh;

import java.io.*;

public class SumFile {
    public static void main(String[] args) {
        String filePath = "src/ss16_io_text_file/thuc_hanh/data";
        readFileText(filePath);

    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("ss");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (IOException e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
            ;
        }
    }
}
