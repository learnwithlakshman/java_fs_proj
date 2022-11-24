package com.careerit.sct.core.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

  @Autowired
  private FormatterFactory formatterFactory;

  public List<Object> formattedData(List<Employee> empList) {
    List<Object> list = new ArrayList<>();
    for (Employee emp : empList) {
      list.addAll(List.of(
          formatterFactory.getFormatter(emp.getName()).format(emp.getName()),
          formatterFactory.getFormatter(emp.getDob()).format(emp.getDob()),
          formatterFactory.getFormatter(emp.getHeight()).format(emp.getHeight()),
          formatterFactory.getFormatter(emp.getSalary()).format(emp.getSalary())
      ));
    }
    return list;
  }
}

