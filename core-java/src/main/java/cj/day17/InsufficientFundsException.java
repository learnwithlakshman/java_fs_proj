package cj.day17;

public class InsufficientFundsException extends RuntimeException {
  public InsufficientFundsException(String message) {
      super(message);
  }
}
