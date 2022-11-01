package cj.day5;

public class SwitchNoDaysInMonth {

    public static void main(String[] args) {
        System.out.println(noOfDaysInMonth(2,2022));
    }

    private static int noOfDaysInMonth(int month, int year) {
        int days = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        return days;
    }

    private static boolean isLeapYear(int year) {
        return (((year % 4 == 0) &&
                !(year % 100 == 0))
                || (year % 400 == 0));
    }
}
