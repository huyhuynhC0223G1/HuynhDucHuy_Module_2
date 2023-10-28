package case_study.ultils;

import case_study.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCustomer {
    public static void writeCustomerListToFile(List<Customer> customers, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer s : customers) {
                bufferedWriter.write(s.getInFoToCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Customer> readCustomerListToFile(String path) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] customerArr = line.split(",");
                Customer customer = new Customer(customerArr[0], customerArr[1], customerArr[2], customerArr[3],
                        customerArr[4], customerArr[5], customerArr[6], customerArr[7], customerArr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
