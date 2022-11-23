package com.careerit.sct.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

  @Autowired
  private DbService dbService;

  public List<String> users() {
    List<String> list = dbService.getUsers();
    return list.stream().map(ele -> ele.trim().toUpperCase()).collect(Collectors.toList());
  }

  public DbService getDbService() {
    return dbService;
  }

  public void setDbService(DbService dbService) {
    this.dbService = dbService;
  }
}
