package cj.day9;

public class AccountManager {
    public static void main(String[] args) {

        Account acc1 = new Account("SB625300001501", "Krish", 45000);
        Account acc2 = new Account("SB625300002601", "Manoj", 15000);
        Account acc3 = new Account("SB625300001201", "Charan", 85000);
        Account acc4 = new Account("SB625300001501", "Tarun", 65000);
        Account acc5 = new Account("SB625300001801", "Jayesh", 5000);

        Account[] arr = new Account[]{acc1, acc2, acc3, acc4, acc5};

        for (Account acc : arr) {
           acc.deposit(500);
        }
    }
}
