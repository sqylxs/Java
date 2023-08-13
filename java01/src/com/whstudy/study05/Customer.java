package com.whstudy.study05;

/**
 * ClassName: Customer
 * Package: com.whstudy.study05
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/28 19:30
 * @Version 1.0
 */
public class Customer {
    private String name;
    private Account account;

    public Customer(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAccount(Account a) {
        account = a;
    }

    public Account getAccount() {
        return account;
    }

    public String print() {
        return "Name = [" + name + "],Account id = [" + account.getId() + "],AnnualInterestRate = ["
                + account.getAnnualInterestRate() * 100 + "%],Balance = [" + account.getBalance() + "]";
    }
}
