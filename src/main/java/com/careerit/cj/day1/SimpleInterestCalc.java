package com.careerit.cj.day1;

import java.util.Scanner;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan amount         :");
        float amount = sc.nextFloat();
        System.out.println("Enter the rate of interest(%) :");
        float rate = sc.nextFloat();
        System.out.println("Enter the duration in years    :");
        float time = sc.nextFloat();
        float si = (amount * time * rate)/100;
        float totalAmount = si + amount;
        System.out.println("Interest is     :"+si);
        System.out.println("Total amount is :"+totalAmount);
    }
}
