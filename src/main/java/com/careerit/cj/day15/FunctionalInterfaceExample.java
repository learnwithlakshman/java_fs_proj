package com.careerit.cj.day15;
// Functional Interface

@FunctionalInterface
interface MathOperation {
  int apply(int a, int b);
}


public class FunctionalInterfaceExample {
  public static void main(String[] args) {

    MathOperation add = (a, b) -> a + b;
    MathOperation mul = (a, b) -> a * b;

    int res1 = add.apply(10, 20);
    System.out.println(res1);
    int res2 = mul.apply(10, 20);
    System.out.println(res2);

  }
}
