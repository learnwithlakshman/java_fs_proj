package com.careerit.cj.empstats.service;

import com.careerit.cj.empstats.domain.Employee;
import com.careerit.cj.empstats.dto.DepartmentStatsDTO;
import com.careerit.cj.empstats.dto.EmployeeBasicInfoDTO;

import java.util.List;

public interface EmployeeService {

      public List<Employee> getEmployeesByLocation(String location);
      public double totalSalary(int deptno);
      public List<DepartmentStatsDTO> getDepartmentsStats();
      public List<String> getEmployeeNames();
      public List<EmployeeBasicInfoDTO> getEmployeeBasicDetails();

}
