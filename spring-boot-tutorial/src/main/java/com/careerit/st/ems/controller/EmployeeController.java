package com.careerit.st.ems.controller;

import com.careerit.st.ems.domain.Employee;
import com.careerit.st.ems.service.EmployeeService;
import com.careerit.st.ems.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping
  public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
    return ResponseEntity.ok(employeeService.addEmployee(employee));
  }
  @PutMapping
  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
    return ResponseEntity.ok(employeeService.updateEmployee(employee));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<ApiResponse> updateEmployee(@PathVariable("id") Long id) {
    employeeService.deleteEmployee(id);
    return ResponseEntity.ok().body(ApiResponse.builder()
        .message("Employee deleted successfully")
        .httpStatus(HttpStatus.OK).build());
  }
  @GetMapping("/{id}")
  public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
    return ResponseEntity.ok(employeeService.getEmployee(id));
  }

  @GetMapping("/search/{str}")
  public ResponseEntity<Page<Employee>> getEmployee(@PathVariable("str") String str,
                                                    @RequestParam(defaultValue = "0", required = false) int pageNumber,
                                                    @RequestParam(defaultValue = "20", required = false) int pageSize) {
    PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
    return ResponseEntity.ok(employeeService.search(pageRequest,str));
  }
  @GetMapping("/list")
  public ResponseEntity<Page<Employee>> getEmployees(
      @RequestParam(defaultValue = "0", required = false) int pageNumber,
      @RequestParam(defaultValue = "20", required = false) int pageSize) {
    PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
    return ResponseEntity.ok(employeeService.getEmployees(pageRequest));
  }

}
