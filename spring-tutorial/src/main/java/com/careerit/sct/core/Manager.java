package com.careerit.sct.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("greetings-bean.xml");
    GreetingService obj = context.getBean(GreetingService.class);
    System.out.println(obj.greet("User"));
  }
}