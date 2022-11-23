package com.careerit.sct.core.assignment;

import java.util.List;

public class EmployeeService {

  public void showDetails(List<Employee> empList) {
    for (Employee emp : empList) {
      System.out.println(FormatterFactory.getFormatter(emp.getName()).format(emp.getName()));
      System.out.println(FormatterFactory.getFormatter(emp.getDob()).format(emp.getDob()));
      System.out.println(FormatterFactory.getFormatter(emp.getHeight()).format(emp.getHeight()));
      System.out.println(FormatterFactory.getFormatter(emp.getSalary()).format(emp.getSalary()));
    }
    // name should display upper case
    // date yyyy-MM-dd
    // double only it have two decimal places ex 67888.98

  }
}

