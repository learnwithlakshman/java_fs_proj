package com.careerit.cj.day10;

class Product extends Object {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

class C1{
    void m1(){

    }
    void m1(int ele){

    }
}
class C2 extends  C1{
    void m3(){

    }
    @Override
    void m1(int ele){

    }

    void m1(int a, int b){

    }
}


public class Manager {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone13", 960000);
        System.out.println(p1);
    }
}
