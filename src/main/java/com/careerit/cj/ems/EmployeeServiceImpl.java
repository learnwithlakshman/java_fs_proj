package com.careerit.cj.ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

  private List<Employee> employeeList = FileReaderUtil.readDataFromCsv();

  @Override
  public List<Employee> maxPaidEmployees() {
    double maxSalary = maxSalary(employeeList);
    List<Employee> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getSalary() == maxSalary) {
        list.add(emp);
      }
    }
    return list;
  }

  @Override
  public List<Employee> minPaidEmployees() {
    double minSalary = minSalary(employeeList);
    List<Employee> minPaidEmployees = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getSalary() == minSalary) {
        minPaidEmployees.add(emp);
      }
    }
    return minPaidEmployees;
  }

  @Override
  public List<Employee> getEmployeesByCountry(String country) {
    List<Employee> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getCountry().equalsIgnoreCase(country)) {
        list.add(emp);
      }
    }
    return list;
  }

  @Override
  public List<Employee> getEmployeesSalaryBtw(double lb, double ub) {
    List<Employee> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getSalary() >= lb && emp.getSalary() <= ub) {
        list.add(emp);
      }
    }
    return list;
  }

  @Override
  public List<Employee> getEmployeesByGender(String gender) {
    List<Employee> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getGender().equalsIgnoreCase(gender)) {
        list.add(emp);
      }
    }
    return list;
  }

  @Override
  public List<Employee> getEmployeesByGenderAndCountry(String gender, String country) {
    List<Employee> list = new ArrayList<>();
    for (Employee emp : employeeList) {
      if (emp.getGender().equalsIgnoreCase(gender) && emp.getCountry().equalsIgnoreCase(country)) {
        list.add(emp);
      }
    }
    return list;
  }

  @Override
  public EmployeeStatsDTO getEmployeeStats() {
    return getEmployeeStatsDTO(employeeList);
  }

  @Override
  public EmployeeStatsDTO getEmployeeStatsByCountry(String country) {
    List<Employee> list = getEmployeesByCountry(country);
    return getEmployeeStatsDTO(list);
  }

  private EmployeeStatsDTO getEmployeeStatsDTO(List<Employee> list) {
    int count = list.size();
    EmployeeStatsDTO obj = new EmployeeStatsDTO();
    obj.setCount(count);
    obj.setMaxSalary(maxSalary(list));
    obj.setMinSalary(minSalary(list));
    obj.setAvgSalary(totalSalary(list) / count);
    obj.setTotalSalary(totalSalary(list));
    return obj;
  }

  private double maxSalary(List<Employee> list) {
    double max = list.get(0).getSalary();
    for (int i = 1; i < list.size(); i++) {
      double salary = list.get(i).getSalary();
      if (max < salary) {
        max = salary;
      }
    }
    return max;
  }

  private double totalSalary(List<Employee> list) {
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i).getSalary();
    }
    return sum;
  }

  private double minSalary(List<Employee> list) {
    double min = list.get(0).getSalary();
    for (int i = 1; i < list.size(); i++) {
      double salary = list.get(i).getSalary();
      if (min > salary) {
        min = salary;
      }
    }
    return min;
  }

}
