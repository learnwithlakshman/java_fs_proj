package com.careerit.cj.collection;


public class EmployeeContainer {
  private Employee[] employees;
  private int count;

  public EmployeeContainer() {
    employees = new Employee[3];
  }

  public void addEmployee(Employee employee) {
    if (count >= employees.length) {
      Employee[] temp = new Employee[employees.length + 3];
      System.arraycopy(employees, 0, temp, 0, employees.length);
      employees = temp;
    }
    employees[count++] = employee;
    System.out.println("Employee added with id:" + employee.getEmpno());
  }

  public void showEmployees() {
    if (count != 0) {
      for (int i = 0; i < count; i++) {
        Employee emp = employees[i];
        System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getSalary());
      }
    } else {
      System.out.println("Sorry! no employees are added yet...");
    }
  }

  public void removeEmployee(Long empno) {
    int index = getIndex(empno);
    if (index != 1) {
      Employee[] temp = new Employee[employees.length - 1];
      System.arraycopy(employees, 0, temp, 0, index);
      System.arraycopy(employees, index + 1, temp, 0, employees.length - index);
      employees = temp;
    } else {
      System.out.println("With given empno there is no employee");
    }
  }

  private int getIndex(Long empno) {
    if (count == 0)
      return -1;
    for (int i = 0; i < count; i++) {
      if (employees[i].getEmpno() == empno) {
        return i;
      }
    }
    return -1;
  }

}
