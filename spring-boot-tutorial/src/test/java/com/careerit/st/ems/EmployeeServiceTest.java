package com.careerit.st.ems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootTest
class EmployeeServiceTest {
  @Autowired
  private EmployeeService employeeService;

  @BeforeEach
  public void init() {
    employeeService.deleteAllEmployees();
  }
  @Test
  void addEmployeeTest(){
    Employee employee = getEmployee();
    Employee emp = employeeService.addEmployee(employee);
    Assertions.assertNotNull(emp.getId());
    Assertions.assertEquals(employee.getName(),emp.getName());
  }
  @Test
  void addEmployeesTest(){
    List<Employee> employees = getEmployees();
    List<Employee> list = employeeService.addEmployees(employees);
    Assertions.assertEquals(employees.size(),list.size());
  }
  @Test
  void findAllWithPageOptions(){
    List<Employee> employees = getEmployees();
    List<Employee> list = employeeService.addEmployees(employees);
    PageRequest pageRequest = PageRequest.of(2,30);
    Page<Employee> page = employeeService.getEmployees(pageRequest);
    Assertions.assertEquals(30,page.getSize());
    Assertions.assertEquals(100,page.getTotalElements());
  }

  private Employee getEmployee() {
    Employee emp = new Employee();
    emp.setDoj(LocalDate.now());
    emp.setDeptNo(20);
    emp.setName("Krish");
    emp.setSalary(145000);
    return emp;
  }

  public List<Employee> getEmployees() {
    List<Employee> list = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      Employee emp = new Employee();
      emp.setDoj(LocalDate.now());
      emp.setDeptNo(10);
      emp.setName("employee_" + i);
      emp.setSalary(ThreadLocalRandom.current().nextInt(2000, 5000));
      list.add(emp);
    }
    return list;
  }

}
