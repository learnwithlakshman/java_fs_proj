package cj.day6;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 5, 1};
        int key = 3;
        int index = search(arr, key);
        if (index == -1) {
            System.out.println("Element " + key + " is not found");
        } else {
            System.out.println("Element " + key + " present at index " + index);
        }
        int[] rev = reverse(arr);
        System.out.println(Arrays.toString(rev));
        System.out.println(Arrays.toString(arr)+" is palindrome :"+isPalindrome(arr));
    }

    // If key is present then it should return index value otherwise return -1
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] reverse(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        return revArr;
    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }


}
