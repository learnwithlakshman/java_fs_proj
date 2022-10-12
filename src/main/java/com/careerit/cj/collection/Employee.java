package com.careerit.cj.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
public class Employee {
  private Long empno;
  private String ename;
  private double salary;

  public Employee(String ename, double salary) {
    if(empno==null){
        this.empno = ThreadLocalRandom.current().nextLong(100001,1000000);
    }
    this.ename = ename;
    this.salary = salary;
  }
}
