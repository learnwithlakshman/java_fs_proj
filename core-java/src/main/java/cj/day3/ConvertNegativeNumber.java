package cj.day3;

import java.util.Scanner;

public class ConvertNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        if(age < 0){
            age = -age;
        }
        System.out.println("Entered age is :"+age);

    }
}
