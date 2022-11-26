package com.careerit.st.ems.repo;

import com.careerit.st.ems.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

  @Query("SELECT e from Employee e where e.name like %:str%")
  Page<Employee> search(PageRequest page, @Param("str") String str);
}
