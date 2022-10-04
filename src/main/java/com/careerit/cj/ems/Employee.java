package com.careerit.cj.ems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
  private Long id;
  private String name;
  private String gender;
  private double salary;
  private String country;


}
