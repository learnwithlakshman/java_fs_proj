package com.careerit.cj.day17;


public class ExceptionExample1 {
  public static void main(String[] args) {
    Account account = new Account("SB1000789", "Krish", 3450000);
    try {
      account.withdraw(70000000);
    } catch (InsufficientFundsException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("End of the main method");
  }
}
