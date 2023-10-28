package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> showCustomer();
    void addNewCustomer(Customer customers);
    void editCustomer(String path, Customer customer);
    int checkCustomerId(String id);
}
