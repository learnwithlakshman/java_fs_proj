package com.careerit.cj.ems;

import lombok.Data;

@Data
public class EmployeeStatsDTO {

    private int count;
    private double totalSalary;
    private double maxSalary;
    private double minSalary;
    private double avgSalary;


}
