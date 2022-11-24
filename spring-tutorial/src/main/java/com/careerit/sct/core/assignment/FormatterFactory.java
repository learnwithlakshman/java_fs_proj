package com.careerit.sct.core.assignment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class FormatterFactory {

      private final Dateformatter dateformatter;
      private final StringFormatter stringFormatter;
      private final NumberFormatter numberFormatter;

      public  Formatter getFormatter(Object obj){
            if(obj instanceof Number){
                  return numberFormatter;
            }else if(obj instanceof LocalDate){
                  return dateformatter;
            }else if(obj instanceof  String){
                  return stringFormatter;
            }else{
                  return new StringFormatter();
            }

      }
}
