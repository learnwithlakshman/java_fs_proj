package cj.day6;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 7, 9, 1, 4, 5, 8};
        System.out.println("Show elements using for loop");
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        float avg = sum / arr.length;
        System.out.println("The sum of elements :"+sum);
        System.out.println("The average is      :"+avg);
        System.out.println("Max element is      :"+max);
        System.out.println("Min element is      :"+min);
    }
}
