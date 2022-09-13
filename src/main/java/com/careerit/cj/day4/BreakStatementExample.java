package com.careerit.cj.day4;

import java.util.Scanner;

public class BreakStatementExample {
    public static void main(String[] args) {
        // Find first n number which is divisible by 3 and 6 but not 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n = sc.nextInt();

        int count  = 0;
        for(int i=1; ;i++){
            if(i % 3 == 0 && i % 6 == 0 && i % 9 != 0){
                System.out.print(i +" ");
                count++;
            }

            if(n == count){
                break;
            }
        }

    }
}
