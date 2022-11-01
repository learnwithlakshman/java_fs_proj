package cj.day3;

import java.util.Scanner;

public class SimpleIfBillAmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        float billAmount = sc.nextFloat();

        float discount = 0;
        float netAmount = 0;

        if(billAmount >=5000){
            discount = billAmount * 0.1f;
        }
        netAmount = billAmount - discount;
        System.out.println("Bill amount     :"+billAmount);
        System.out.println("Discount amount :"+discount);
        System.out.println("Net amount      :"+netAmount);


    }
}
