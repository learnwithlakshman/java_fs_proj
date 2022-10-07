package com.careerit.cj.empstats.service;

import com.careerit.cj.empstats.domain.Department;
import com.careerit.cj.empstats.domain.Employee;
import com.careerit.cj.empstats.dto.DepartmentStatsDTO;
import com.careerit.cj.empstats.dto.EmployeeBasicInfoDTO;
import com.careerit.cj.empstats.util.CsvReaderUtil;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService {

  private List<Employee> empList;
  private List<Department> deptList;

  public EmployeeServiceImpl() {
      empList = CsvReaderUtil.loadEmployees();
      deptList = CsvReaderUtil.loadDepartments();
  }

  @Override
  public List<Employee> getEmployeesByLocation(String location) {
    return null;
  }

  @Override
  public double totalSalary(int deptno) {
    return 0;
  }

  @Override
  public List<DepartmentStatsDTO> getDepartmentsStats() {
    return null;
  }

  @Override
  public List<String> getEmployeeNames() {
    return null;
  }

  @Override
  public List<EmployeeBasicInfoDTO> getEmployeeBasicDetails() {
    return null;
  }
}
