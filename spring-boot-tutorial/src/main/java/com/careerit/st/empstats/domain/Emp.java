package com.careerit.st.empstats.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="emp")
@Getter
@Setter
public class Emp {
    @Id
    private Integer empno;
    private String name;
    private String email;
    private float salary;
    private String gender;
    private String country;
    @ManyToOne
    @JoinColumn(name = "deptno",referencedColumnName = "deptno")
    private Department department;


}
