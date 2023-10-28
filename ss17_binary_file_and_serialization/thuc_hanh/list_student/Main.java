package ss17_binary_file_and_serialization.thuc_hanh.list_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String PATH = "src\\ss17_binary_file_and_serialization\\thuc_hanh\\list_student\\list_student.txt";
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "ad", "DN"));
        list.add(new Student(2, "as", "HN"));
        list.add(new Student(3, "dc", "HCM"));
        list.add(new Student(4, "we", "GL"));
        list.add(new Student(5, "vf", "DN"));
        writeDataToFile(PATH, list);
        List<Student> students = readDataFromFile(PATH);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String PATH) {
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
