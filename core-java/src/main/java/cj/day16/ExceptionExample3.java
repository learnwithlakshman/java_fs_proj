package cj.day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample3 {
  public static void main(String[] args) {
    System.out.println("Start of main method");
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the num1: ");
      int num1 = sc.nextInt();
      System.out.println("Enter the num2: ");
      int num2 = sc.nextInt();
      int res = num1 / num2;
      System.out.println("The result is :"+res);

    } catch (ArithmeticException e) {
      System.out.println("Value of num2 can't be zero");
    } finally {
      System.out.println("Finally Block");
    }
    System.out.println("End of main method");

  }

  public void loadData() {

    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(new File("dept.csv")));
    } catch (IOException e) {
      System.out.println("While reading file :" + e);
    } finally {
      try {
        if (br != null)
          br.close();
      } catch (IOException e) {
        System.out.println("While closing file :" + e);
      }
    }
  }

}
