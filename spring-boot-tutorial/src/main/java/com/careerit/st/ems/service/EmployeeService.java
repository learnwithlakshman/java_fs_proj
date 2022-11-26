package com.careerit.st.ems.service;

import com.careerit.st.ems.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);
    public Page<Employee> getEmployees(PageRequest pageRequest);
    public List<Employee> addEmployees(List<Employee> employeeList);

    public boolean deleteEmployee(Long id);
    public Employee getEmployee(Long id);
    public Employee updateEmployee(Employee employee);
    public Page<Employee> search(PageRequest pageRequest,String str);
    public void deleteAllEmployees();
}
