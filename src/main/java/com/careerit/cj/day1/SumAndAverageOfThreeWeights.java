package com.careerit.cj.day1;

import java.util.Scanner;

public class SumAndAverageOfThreeWeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person 1 weight :");
        float personWeight1 = sc.nextFloat();
        System.out.println("Enter the person 2 weight :");
        float personWeight2 = sc.nextFloat();
        System.out.println("Enter the person 3 weight :");
        float personWeight3 = sc.nextFloat();
        float sumOfWeights = personWeight1 + personWeight2 + personWeight3;
        float avgWeight = sumOfWeights/3;
        System.out.println("The sum of weight is  :"+sumOfWeights);
        System.out.println("The Average weight is :"+avgWeight);
    }
}
