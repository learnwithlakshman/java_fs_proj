package cj.day4;

import java.util.Scanner;

public class CountOddNumberInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lb value :");
        int lb = sc.nextInt();
        System.out.println("Enter ub value :");
        int ub = sc.nextInt();
        int count = 0;
        for(int i=lb;i<=ub;i++){
            if(i % 2 != 0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nOdd numbers count between "+lb+" and "+ub+" is "+count);
    }
}
