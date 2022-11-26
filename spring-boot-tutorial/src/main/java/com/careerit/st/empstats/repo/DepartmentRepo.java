package com.careerit.st.empstats.repo;


import com.careerit.st.empstats.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
