package com.careerit.cj.day12;
abstract class Account {

    String accNumber;
    String name;
    double balance;

    public Account(String accNumber, String name, double balance) {
        super();
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public void showDetails() {
        System.out.println("Acc number   :" + mask(accNumber));
        System.out.println("Name         :" + name);
        System.out.println("Balance      :" + balance);
    }

     String mask(String accNumber) {
        String maskedAccNumber = "XX" + accNumber.substring(accNumber.length() - 3);
        return maskedAccNumber;
    }


}
class Savings extends  Account{
    private double minBalance=1000;
    Savings(String accNumber, String name, double balance){
        super(accNumber,name,balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance - minBalance)) {
            System.out.println("Sorry! you don't have sufficient funds");
        } else {
            this.balance -= amount;
            String message = String.format("Account %s credited with %s and balance %s", mask(this.accNumber),
                    amount, this.balance);
            System.out.println(message);
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        String message = String.format("Account %s debited with %s and balance %s", mask(this.accNumber),
                amount, this.balance);
        System.out.println(message);
    }


}
class Current extends  Account{
    private double overDraft=10000;
    Current(String accNumber, String name, double balance){
        super(accNumber,name,balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overDraft)) {
            System.out.println("Sorry! you don't have sufficient funds");
        } else {
            this.balance -= amount;
            String message = String.format("Account %s credited with %s and balance %s", mask(this.accNumber),
                    amount, this.balance);
            System.out.println(message);
        }
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        String message = String.format("Account %s debited with %s and balance %s", mask(this.accNumber),
                amount, this.balance);
        System.out.println(message);
    }

}


public class AccountManager {

    public static void main(String[] args) {

            Account acc = new Savings("SB000012341001","Krish",34000);
            Account acc1 = new Current("CB00001234567","CCI",450000000);
    }
}





