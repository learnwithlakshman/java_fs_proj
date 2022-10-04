package com.careerit.cj.ems;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService {

  private List<Employee> employeeList = FileReaderUtil.readDataFromCsv();

  @Override
  public List<Employee> maxPaidEmployees() {
    double maxSalary = maxSalary(employeeList);
    List<Employee> list = new ArrayList<>();
    for(Employee emp:employeeList){
        if(emp.getSalary() == maxSalary){
          list.add(emp);
        }
    }
    return list;
  }
  @Override
  public List<Employee> minPaidEmployees() {
    return null;
  }

  @Override
  public List<Employee> getEmployeesByCountry(String country) {
    return null;
  }

  @Override
  public List<Employee> getEmployeesSalaryBtw(double lb, double ub) {
    return null;
  }

  @Override
  public List<Employee> getEmployeesByGender(String gender) {
    return null;
  }

  @Override
  public List<Employee> getEmployeesByGenderAndCountry(String gender, String country) {
    return null;
  }

  @Override
  public EmployeeStatsDTO getEmployeeStats() {
    return null;
  }

  @Override
  public EmployeeStatsDTO getEmployeeStatsByCountry(String country) {
    return null;
  }

  private double maxSalary(List<Employee> list){
    //Logic return max salary
    return 0;
  }
  private double totalSalary(List<Employee> list){
    //Logic return total salary
    return 0;
  }
  private double minSalary(List<Employee> list){
    //Logic return min  salary
    return 0;
  }

}
