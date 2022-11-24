package com.careerit.sct.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;
import java.util.List;

@ComponentScan("com.careerit.sct.core.assignment")
public class Manager {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    EmployeeService employeeService = context.getBean(EmployeeService.class);
    employeeService.formattedData(List.of(new Employee("Krish", LocalDate.now(), 5.4f, 4590.9989f)));

  }
}
