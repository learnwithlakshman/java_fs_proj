package com.careerit.st.ems.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employee")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private float salary;
    @Column(name = "doj")
    private LocalDate doj;
    @Column(name = "dept_no")
    private int deptNo;

}
