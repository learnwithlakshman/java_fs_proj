package com.careerit.cj.collection;

import java.util.Scanner;

public class Manager {

  public static void main(String[] args) {

    EmployeeContainer empService = new EmployeeContainer();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1.Add employee 2.Show employees 3.Delete employee 4.Exit");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          sc.nextLine();
          System.out.println("Enter the name: ");
          String name = sc.nextLine();
          System.out.println("Enter the balance: ");
          double balance = sc.nextDouble();
          Employee employee = new Employee(name, balance);
          empService.addEmployee(employee);
          break;
        case 2:
          empService.showEmployees();
          break;
        case 3:
          break;
        case 4:
          System.out.println("Thank you, application is going close");
          System.exit(0);
      }
    }
  }
}
