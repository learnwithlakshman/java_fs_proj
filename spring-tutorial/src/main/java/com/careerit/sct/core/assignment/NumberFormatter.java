package com.careerit.sct.core.assignment;

import org.springframework.stereotype.Component;

@Component
public class NumberFormatter implements  Formatter {
  @Override
  public Object format(Object obj) {
    if(obj instanceof  Float || obj instanceof  Double){
      Number number = (Number)obj;
      return String.format("%.2f",number);
    }else if(obj instanceof  Integer){
      Number number = (Number)obj;
      return number.toString();
    }
    return null;
  }
}
