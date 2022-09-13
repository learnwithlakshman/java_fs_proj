package com.careerit.cj.day2;

import java.util.Scanner;

public class StudentTotalScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.nextLine();
        System.out.println("Enter the subject1 score :");
        int subject1 = sc.nextInt();
        System.out.println("Enter the subject2 score :");
        int subject2 = sc.nextInt();
        System.out.println("Enter the subject3 score :");
        int subject3 = sc.nextInt();
        int sum = subject1 + subject2 + subject3;
        System.out.println("Name        :" + name);
        System.out.println("Total Score :" + sum);
    }
}
