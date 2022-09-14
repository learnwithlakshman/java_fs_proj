package com.careerit.cj.day5;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2:");
            int num2 = sc.nextInt();
            System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Mod 6.Exit Please enter your choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("Thank you ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select value 1-6 only");
            }
            System.out.println("Do you want continue? 1-continue 0-exit");
            int choice = sc.nextInt();
            if(choice == 0){
                break;
            }
        }
    }
}
