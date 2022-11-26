package com.careerit.st.empstats.repo;

import com.careerit.st.empstats.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
}
