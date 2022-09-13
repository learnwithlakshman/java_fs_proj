package com.careerit.cj.day4;

public class PrimeNumberUtil {

    public static void main(String[] args) {
            int lb= 10;
            int ub = 30;
            showPrimsInRange(lb,ub);
            System.out.println("\n"+countPrimeInRange(lb,ub));
    }

    private static void showPrimsInRange(int lb,int ub){
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    private static int countPrimeInRange(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num < 2 || (isEven(num) && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
