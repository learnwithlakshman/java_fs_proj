package com.careerit.st.ems;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements  EmployeeService {

  @Autowired
  private EmployeeRepo employeeRepo;

  @Override
  public Employee addEmployee(Employee employee) {
    Assert.notNull(employee,"Employee object can't be null");
    Assert.hasText(employee.getName(),"Name can't empty");
    Employee emp = employeeRepo.save(employee);
    log.info("Employee saved with id {}",emp.getId());
    return emp;
  }

  @Override
  public Page<Employee> getEmployees(PageRequest pageRequest) {
    return employeeRepo.findAll(pageRequest);
  }

  @Override
  public List<Employee> addEmployees(List<Employee> employeeList) {
    return employeeRepo.saveAll(employeeList);
  }

  @Override
  public void deleteAllEmployees() {
      employeeRepo.deleteAll();
  }
}
