package com.careerit.cj.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

class Product {

  int pid;
  String name;
  double price;

  public Product(int pid, String name, double price) {
    this.pid = pid;
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
        .add("pid=" + pid)
        .add("name='" + name + "'")
        .add("price=" + price)
        .toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return pid == product.pid && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, name, price);
  }
}

public class SetExample2 {

  public static void main(String[] args) {

    Product p1 = new Product(1001, "Lenovo ThinkPad", 85000);
    Product p2 = new Product(1001, "Lenovo ThinkPad", 85000);
    Product p3 = p1;

    Set<Product> set = new HashSet<>();
    set.add(p1);
    set.add(p2);
    set.add(p3);

    System.out.println(set.size());

  }
}
