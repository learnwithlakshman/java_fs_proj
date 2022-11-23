package com.careerit.sct.core.assignment;

import java.time.LocalDate;

public class FormatterFactory {

      public static Formatter getFormatter(Object obj){
            if(obj instanceof Number){
                  return null;
            }else if(obj instanceof LocalDate){
                  return null;
            }else if(obj instanceof  String){
                  return null;
            }else{
                  return new StringFormatter();
            }

      }
}
