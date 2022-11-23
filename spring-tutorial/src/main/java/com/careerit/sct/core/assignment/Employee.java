package com.careerit.sct.core.assignment;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private String name;
  private LocalDate dob;
  private float height;
  private float salary;
}
