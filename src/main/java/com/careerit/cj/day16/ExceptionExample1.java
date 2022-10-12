package com.careerit.cj.day16;

public class ExceptionExample1 {

  public static void main(String[] args) {
    String[] names = new String[]{"Krish", "Manoj", "Rajesh", "Sai", "CV", "Charan"};
    for (String name : names) {
      try {
        System.out.println(name.substring(0, 3).toUpperCase());
      } catch (ArrayIndexOutOfBoundsException  e) {
        System.out.println(name + " has < 3 characters " + e);
      }catch (StringIndexOutOfBoundsException e){
        System.out.println(name + " has < 3 characters " + e);
      }catch (Exception e){
        e.printStackTrace();
      }
    }
    System.out.println("End of main method");
  }
}
