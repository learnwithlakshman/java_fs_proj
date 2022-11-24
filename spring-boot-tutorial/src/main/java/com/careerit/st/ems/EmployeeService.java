package com.careerit.st.ems;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public Page<Employee> getEmployees(PageRequest pageRequest);
    public List<Employee> addEmployees(List<Employee> employeeList);
    public void deleteAllEmployees();
}
