package com.careerit.sct.core.di;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class DbService {

  public List<String> getUsers(){
    return List.of("Krish","manoj","charan","Kiran ","Jayesh");
  }
}
