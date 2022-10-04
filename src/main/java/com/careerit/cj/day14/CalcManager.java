package com.careerit.cj.day14;

interface NumberOperations {
    public boolean isPrime(int num);

    public int biggest(int a, int b);

    public boolean isEven(int num);

    default int[] primeInRange(int lb, int ub) {
        int[] arr = new int[primeCount(lb, ub)];
        for (int i = lb, j = 0; i <= ub; i++) {
            if (isPrime(i)) {
                arr[j++] = i;
            }
        }
        return arr;
    }

    default int primeCount(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private int sumNnumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static int gcd(int num1, int num2, int num3) {
        return gcd(gcd(num1, num2), num3);
    }


}

class MyNumberOperations implements NumberOperations {

    @Override
    public boolean isPrime(int num) {
        if (num < 2 || (isEven(num) && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 3; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int biggest(int a, int b) {
        return a > b ? a : b;
    }

    @Override
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}


public class CalcManager {
}
