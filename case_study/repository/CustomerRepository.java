package case_study.repository;

import case_study.model.Customer;
import case_study.ultils.ReadAndWriteFileCustomer;
import case_study.ultils.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static List<Customer> customerList = new ArrayList<>();
    public static final String CUSTOMER_FILE_PATH = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> showCustomer() {
        customerList = ReadAndWriteFileCustomer.readCustomerListToFile(CUSTOMER_FILE_PATH);
        return customerList;
    }

    @Override
    public void addNewCustomer(Customer customers) {
        customerList = ReadAndWriteFileCustomer.readCustomerListToFile(CUSTOMER_FILE_PATH);
        customerList.add(customers);
        ReadAndWriteFileCustomer.writeCustomerListToFile(customerList, CUSTOMER_FILE_PATH);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        customerList = ReadAndWriteFileCustomer.readCustomerListToFile(CUSTOMER_FILE_PATH);
        customerList.set(checkCustomerId(id), customer);
        ReadAndWriteFileCustomer.writeCustomerListToFile(customerList, CUSTOMER_FILE_PATH);
    }

    @Override
    public int checkCustomerId(String id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
