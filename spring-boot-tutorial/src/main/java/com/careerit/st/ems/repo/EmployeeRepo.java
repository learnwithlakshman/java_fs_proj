package com.careerit.st.ems.repo;

import com.careerit.st.ems.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

  @Query(nativeQuery = true,value = "select id,name,salary,doj,dept_no from employee where name like %:str%")
  List<Employee> search(@Param("str") String str);
}
