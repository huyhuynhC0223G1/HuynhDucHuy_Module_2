package ss17_binary_file_and_serialization.bai_tap.bai_1.common;

import ss17_binary_file_and_serialization.bai_tap.bai_1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void writeDataToFile(String path, List<Product> products) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (file.length() == 0) {
                list = new ArrayList<>();
            } else {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (List<Product>) ois.readObject();
                fis.close();
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
