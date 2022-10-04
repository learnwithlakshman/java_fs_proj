package com.careerit.cj.ems;

import java.util.List;

public class EmployeeManager {
  public static void main(String[] args) {

      EmployeeService employeeService = new EmployeeServiceImpl();

      List<Employee> list = employeeService.getEmployeesByCountry("India");
      System.out.println(list.size());
  }
}
