package cj.empstats.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Employee {
  private long id;
  private String name;
  private double salary;
  private LocalDate doj;
  private int deptno;
}
