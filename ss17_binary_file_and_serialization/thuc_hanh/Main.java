package ss17_binary_file_and_serialization.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class Main {
    static final String PATH_SOURCE ="src/ss17_binary_file_and_serialization/thuc_hanh/source";
    static final String PATH_DESTINATION = "src/ss17_binary_file_and_serialization/thuc_hanh/destination";
    private static void copyFileUsingStream(File PATH_SOURCE, File PATH_DESTINATION)throws IOException{
        InputStream is = null;
        OutputStream os =null;
        try {
            is = new FileInputStream(PATH_SOURCE);
            os = new FileOutputStream(PATH_DESTINATION);
        byte[] bytes =new byte[1024];
        int length;
        while ((length = is.read(bytes))>0){
            os.write(bytes, 0 , length);
        }
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        File sf = new File(PATH_SOURCE);
        File df = new File(PATH_DESTINATION);
        copyFileUsingStream(sf,df);
    }
}
