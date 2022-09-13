package com.careerit.cj.day2;

import java.util.Scanner;

public class RequiredCabs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count:");
        int count= sc.nextInt();
        System.out.println("Enter the capacity:");
        int capacity = sc.nextInt();
        int requiredCount = 0;

        //Logic
        if(count % capacity == 0){
            requiredCount = count/capacity;
        }else{
            requiredCount = (count/capacity) + 1;
        }
        System.out.println("Total count :"+count+" capacity :"+capacity+" and required cab count :"+requiredCount);
    }
}
