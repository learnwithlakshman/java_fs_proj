package com.careerit.cj.day6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        String[] names = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the " + (i + 1) + " name ");
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

    }
}
