package cj.day9;

public class Account {

    String accNumber;
    String name;
    double balance;

    public Account(String accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Sorry! you don't have sufficient funds");
        } else {
            this.balance -= amount;
            String message = String.format("Account %s credited with %s and balance %s", mask(this.accNumber),
                    amount, this.balance);
            System.out.println(message);
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        String message = String.format("Account %s debited with %s and balance %s", mask(this.accNumber),
                amount, this.balance);
        System.out.println(message);
    }

    public void showDetails() {
        System.out.println("Acc number   :" + mask(accNumber));
        System.out.println("Name         :" + name);
        System.out.println("Balance      :" + balance);
    }

    private String mask(String accNumber) {
        String maskedAccNumber = "XX" + accNumber.substring(accNumber.length() - 3);
        return maskedAccNumber;
    }


}
