package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> showEmployee();
    void addEmployyeStaff(Employee employee);

    void editEmployeeStaff(String id, Employee employee);

    int checkEmployee(String id);
}
