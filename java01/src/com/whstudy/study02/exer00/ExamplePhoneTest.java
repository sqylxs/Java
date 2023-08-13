package com.whstudy.study02.exer00;

import java.util.Scanner;

/**
 * ClassName: ExamplePhoneTest
 * Package: com.whstudy.study02
 * Description:
 *
 * 对手机这个类的一个使用
 *
 * @Author whstudy
 * @Create 2023/7/24 17:24
 * @Version 1.0
 */
public class ExamplePhoneTest {
    public static void main(String[] args) {
        //创建Phone类的对象
        //格式：类类型 对象名 = 通过new创建的对象实体
        //eg:Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        //创建Phone的对象
        ExamplePhone p1 = new ExamplePhone();
        //通过Phone的对象，调用其内部声明的属性或方法
        //格式："对象.属性" 或 "对象.方法"
        p1.name = "huawei mate 50";
        p1.price = 6999;
        System.out.println(p1.name + "\t" + p1.price);
        //调用方法
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
