package com.careerit.sct.core.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class UserDataService {

  @PreDestroy
  public void destroy() throws Exception {
    System.out.println("Before destory");
  }

  @PostConstruct
  public void init() throws Exception {
    System.out.println("After property set");
  }
}
