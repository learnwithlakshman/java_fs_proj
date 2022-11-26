package com.careerit.st.empstats.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dept")
@Getter
@Setter
public class Department {
  @Id
  @Column(name = "deptno")
  private Integer deptno;
  @Column(name = "dname")
  private String dname;
  @Column(name = "location")
  private String location;
  @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
  private List<Emp> empList;
}
