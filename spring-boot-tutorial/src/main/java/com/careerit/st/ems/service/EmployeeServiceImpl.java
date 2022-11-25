package com.careerit.st.ems.service;
import com.careerit.st.ems.domain.Employee;
import com.careerit.st.ems.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepo employeeRepo;

  @Override
  public Employee addEmployee(Employee employee) {
    Assert.notNull(employee, "Employee object can't be null");
    Assert.hasText(employee.getName(), "Name can't empty");
    Employee emp = employeeRepo.save(employee);
    log.info("Employee saved with id {}", emp.getId());
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
  public boolean deleteEmployee(Long id) {
    Assert.notNull(id, "To perform delete operation id can not be null");
    final var message = String.format("Employee with id %s is not found", id);
    if (!employeeRepo.existsById(id)) {
      log.error(message);
      throw new IllegalArgumentException(message);
    }
    employeeRepo.deleteById(id);
    log.info("Employee with id :{} deleted successfully", id);
    return true;
  }

  @Override
  public Employee getEmployee(Long id) {
    Assert.notNull(id, "To employee details id can not be null");
    Optional<Employee> optionEmp = employeeRepo.findById(id);
    return optionEmp.orElseThrow(() -> new IllegalArgumentException(String.format("Employee with id %s is not found", id)));
  }

  @Override
  public Employee updateEmployee(Employee employee) {
    Assert.notNull(employee, "Employee object can not be null");
    Assert.notNull(employee.getId(), "Employee id can not be null");
    Assert.hasText(employee.getName(), "Employee name can not be empty");
    Employee updateEmployee = employeeRepo.saveAndFlush(employee);
    log.info("Employee with id {} updated successfully", updateEmployee.getId());
    return updateEmployee;
  }

  @Override
  public List<Employee> search(String str) {
    if (!StringUtils.hasText(str)){
        return employeeRepo.findAll();
    }else{
        return employeeRepo.search(str);
    }
  }

  @Override
  public void deleteAllEmployees() {
    employeeRepo.deleteAll();
  }
}
