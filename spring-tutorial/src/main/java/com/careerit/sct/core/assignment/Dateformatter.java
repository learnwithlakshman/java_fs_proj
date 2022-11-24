package com.careerit.sct.core.assignment;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class Dateformatter implements  Formatter{
  @Override
  public Object format(Object obj) {
    if(obj instanceof LocalDate date){
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      return formatter.format(date);
    }
    return "";
  }
}
