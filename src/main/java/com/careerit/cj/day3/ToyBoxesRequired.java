package com.careerit.cj.day3;

import java.util.Scanner;

public class ToyBoxesRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Toys count   :");
        int toyCount = sc.nextInt();
        System.out.println("Enter the box capacity :");
        int boxCapacity = sc.nextInt();
        int boxCount = 0;
        if(toyCount > boxCapacity){
            if(toyCount % boxCapacity == 0){
                boxCount = toyCount / boxCapacity;
            }else{
                boxCount = toyCount / boxCapacity + 1;
            }
        }else{
            boxCount = 1;
        }
        System.out.println("Total toys "+toyCount+" box capacity "+boxCapacity+"  required boxes "+boxCount);
    }
}
