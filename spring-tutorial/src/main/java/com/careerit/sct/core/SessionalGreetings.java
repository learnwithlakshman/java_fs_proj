package com.careerit.sct.core;

public class SessionalGreetings implements  GreetingService {
  @Override
  public String greet(String user) {
    return String.format("%s, Wish you happy weekend",user);
  }
}
