package com.careerit.sct.core.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.careerit.sct.core.scope")
public class Manager {
  public static void main(String[] args) {

    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
    UserService userService1 = context.getBean(UserService.class);
    UserService userService2 = context.getBean(UserService.class);
    System.out.println(userService1.maxValue());
    System.out.println(userService2.maxValue());

    System.out.println(userService1.getDbService());
    System.out.println(userService2.getDbService());

    UserDataService obj = context.getBean(UserDataService.class);
    context.close();

  }
}
