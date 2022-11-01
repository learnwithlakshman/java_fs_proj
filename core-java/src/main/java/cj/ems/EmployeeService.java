package cj.ems;

import java.util.List;

public interface EmployeeService {

      List<Employee> maxPaidEmployees();
      List<Employee> minPaidEmployees();
      List<Employee> getEmployeesByCountry(String country);
      List<Employee> getEmployeesSalaryBtw(double lb,double ub);
      List<Employee> getEmployeesByGender(String gender);
      List<Employee> getEmployeesByGenderAndCountry(String gender,String country);
      EmployeeStatsDTO getEmployeeStats();
      EmployeeStatsDTO getEmployeeStatsByCountry(String country);

}
