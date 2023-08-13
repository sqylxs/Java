package com.whstudy.study05;

/**
 * ClassName: CustomerTest
 * Package: com.whstudy.study05
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/28 19:34
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("鸿");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(1000);
        customer.getAccount().withdraw(200);
        customer.getAccount().withdraw(20000);
        System.out.println(customer.print());
    }
}
