package com.careerit.cj.day7;

import java.util.Arrays;

public class SumOfElements {

    public static void main(String[] args) {

            int[][] arr = new int[][]{
                    {3,4,5,3},
                    {4,5,6,5},
                    {8,9,1,3},
                    {5,6,7,8}
            };
        System.out.println(Arrays.toString(columnSum(arr)));


    }

    public static int sumOfElements(int[][] arr){
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    sum += arr[i][j];
                }
            }
            return sum;
    }

    public static int[] columnSum(int[][] arr){
           int[] sumArr = new int[arr[0].length];

           int count = 0;
           for(int i=0;i<arr[0].length;i++){
               int sum = 0;
               for(int j=0;j<arr.length;j++){
                   sum+=arr[j][i];
               }
               sumArr[count++]=sum;

           }
           return sumArr;
    }
    public static int sumOfDiagonalElement(int[][] arr){

        return 0;
    }
    public static int[] rowSum(int[][] arr){

        return null;
    }
}
