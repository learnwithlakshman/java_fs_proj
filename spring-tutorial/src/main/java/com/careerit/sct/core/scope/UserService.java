package com.careerit.sct.core.scope;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.inject.Provider;


@Service
public class UserService {

  @Autowired
  private Provider<DbService> dbServiceProvider;


  public Integer maxValue(){
    return getDbService().getRandom10Numbers().stream().mapToInt(ele -> ele).max().getAsInt();

  }


  public DbService getDbService() {
    return dbServiceProvider.get();
  }


}
