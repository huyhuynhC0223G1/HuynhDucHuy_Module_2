package ss17_binary_file_and_serialization.bai_tap.bai_2;

import java.io.*;
import java.util.List;

public class CopyFileText {
    static final String PATH_SOURCE_FILE = "src/ss17_binary_file_and_serialization/bai_tap/bai_2/source.txt";
    static final String PATH_TARGET_FILE = "src/ss17_binary_file_and_serialization/bai_tap/bai_2/target.txt";

    private static void copyFile(File PATH_SOURCE_FILE, File PATH_TARGET_FILE) throws IOException {
        FileInputStream input = new FileInputStream(PATH_SOURCE_FILE);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(PATH_SOURCE_FILE);
            outputStream = new FileOutputStream(PATH_TARGET_FILE);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) > 0) {
                outputStream.write(bytes, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
            System.out.println("Số byte khả dụng lúc đầu là: " + input.available());
        }
    }

    public static void main(String[] args) throws IOException {
        File sourcefile = new File(PATH_SOURCE_FILE);
        File targetfile = new File(PATH_TARGET_FILE);
        copyFile(sourcefile, targetfile);
    }
}