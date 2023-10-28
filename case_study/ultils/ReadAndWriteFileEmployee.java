package case_study.ultils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {
    public static void writeEmployeeListToFile(List<Employee> employees, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee s : employees) {
                bufferedWriter.write(s.getInfoToEmployeeCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> readEmployeeListFromFile(String path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] employeeArr = line.split(",");
                Employee employee = new Employee(employeeArr[0],employeeArr[1],employeeArr[2],employeeArr[3],employeeArr[4],employeeArr[5],employeeArr[6],employeeArr[7],employeeArr[8],employeeArr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
