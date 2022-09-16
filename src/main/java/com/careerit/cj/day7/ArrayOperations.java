package com.careerit.cj.day7;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = copyElements(new int[]{1, 2}, new int[]{3, 4, 5});
        System.out.println(Arrays.toString(arr));

    }

    public static int[] copyElements(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        /*int c = 0;
        for(int i=0;i<a.length;i++){
            temp[c++] = a[i];
        }
        for(int i=0;i<b.length;i++){
            temp[c++] = b[i];
        }*/
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);
        return temp;
    }
    public static int subArrayCount(int[] arr,int k){
       /* [1,2,3,4,5,6] => k = 3
                [1,2,3] => 1
                [2,3,4] => 2
                [3,4,5] => 3
                [4,5,6] => 4
        */

        return 0;
    }
}
