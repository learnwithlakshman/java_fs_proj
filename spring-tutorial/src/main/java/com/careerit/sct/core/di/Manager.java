package com.careerit.sct.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@ComponentScan(basePackages = "com.careerit.sct.core")
public class Manager {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
      UserService userService = context.getBean("userService",UserService.class);
      List<String> list= userService.users();
      list.stream().forEach(name->{
        System.out.println(name);
      });
  }
}
