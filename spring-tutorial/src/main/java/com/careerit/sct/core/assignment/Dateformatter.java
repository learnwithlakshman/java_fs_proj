package com.careerit.sct.core.assignment;

import java.time.LocalDate;

public class Dateformatter implements  Formatter{
  @Override
  public Object format(Object obj) {
    if(obj instanceof LocalDate){
      //Logic to format
    }
    return null;
  }
}
