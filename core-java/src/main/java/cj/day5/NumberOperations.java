package cj.day5;

public class NumberOperations {

    public static void main(String[] args) {
        int num = 5;
        showNArmstrongNumbers(num);
        System.out.println(sumOfDigitsUntilSingleDigit(27981));
    }

    public static int sumOfDigitsUntilSingleDigit(int num) {
       /* int sum = 0;
        while (num > 9) {
            sum = 0;
            while (num != 0) {
                int r = num % 10;
                sum += r;
                num = num / 10;
            }
            num = sum;
        }
        return sum;*/

        while (num > 9) {
            int sum = num % 10 + num / 10;
            num = sum;
        }
        return num;
    }

    public static void showNArmstrongNumbers(int n) {
        int count = 0;
        int i = 1;
        while (true) {
            if (isArmstrong(i)) {
                count++;
                System.out.println(i + " ");
            }
            if (count == n) {
                break;
            }
            i++;
        }
    }

    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + (r * r * r);
            temp /= 10;
        }
        return sum == num;
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return reverse(num) == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }
}
