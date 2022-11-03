package com.careerit.jdbc.bulk;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryStats {
    private String name;
    private int count;
    private double maxSalary;
    private double minSalary;
    private double avgSalary;
}
