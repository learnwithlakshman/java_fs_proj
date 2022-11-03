package com.careerit.jdbc.bulk;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppUser {
  private long id;
  private String name;
  private String country;
  private double salary;
  private String gender;
}
