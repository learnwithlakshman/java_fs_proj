package cj.day8;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println(str+" is palindrome ? "+isPalindrome(str));

    }
    private static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeWithSB(String str) {
       return new StringBuilder(str).reverse().toString().equals(str);
    }

}
