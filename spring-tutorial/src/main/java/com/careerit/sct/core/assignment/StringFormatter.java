package com.careerit.sct.core.assignment;

import org.springframework.stereotype.Component;

@Component
public class StringFormatter implements  Formatter{
  @Override
  public Object format(Object obj) {
    if(obj == null){
      return "";
    }
    if(obj instanceof  String str){
       return str.toUpperCase();
    }
    return obj.toString();
  }
}
