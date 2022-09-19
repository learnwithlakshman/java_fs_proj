package com.careerit.cj.day8;

public class AssignmentQuestions {

    public static void main(String[] args) {
        String[] arr = new String[]{"12321","liril","mom","krish","charan","krish","dad","mom"};
        int count = countPalindromes(arr);
        System.out.println("Palindrome count: "+count);
        String str = "mom";
        int occurrences = search(arr,str);
        System.out.println(str+" is occurred "+occurrences+" times");
        float totalSalary = getTotalSalary();
        System.out.println("Total salary :"+totalSalary);
    }

    private static int search(String[] arr,String key){
        /* Count occurrence of key in the given arr */

        return 0;
    }
    public static int countPalindromes(String[] arr){
        return 0;
    }
    public static boolean isPalindrome(String[] arr){
        // if String array is palindrome return true otherwise false

        return false;
    }


    public static float getTotalSalary(){
        String data = "1001-Krish-35000,1002-Manoj-45000,1003-Charan-55000";
        return 0;
    }



}
