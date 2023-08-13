package com.whstudy.study05;

/**
 * ClassName: Account
 * Package: com.whstudy.study05
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/28 18:00
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int b) {
        balance = b;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int a) {
        annualInterestRate = a;
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("拿到手了，总共" + amount + "这么多钱");
        } else if (amount < 0) {
            System.out.println("你输入的数据不合法");
        } else {
            System.out.println("没这么多钱，你直接抢银行吧");
        }
    }

    public void deposit(double amount) {
        if (balance > 0) {
            balance += amount;
            System.out.println("存进去了，一共存了" + amount + "这么多钱");
        }

    }

}
