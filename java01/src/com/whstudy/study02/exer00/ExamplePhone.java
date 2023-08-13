package com.whstudy.study02.exer00;

/**
 * ClassName: ExamplePhone
 * Package: com.whstudy.study02
 * Description:
 * <p>
 * 声明一个类——手机
 *
 * @Author whstudy
 * @Create 2023/7/24 17:17
 * @Version 1.0
 */
public class ExamplePhone {
    //属性(或成员变量)
    String name;//品牌
    double price;//价格

    //方法
    public void call() {
        String phoneNUmber = "12345678911"; //局部变量
        System.out.println("手机能够拨打" + phoneNUmber + "这个电话");

    }

    public void sendMessage(String message) { // 形参： 属于局部变量
        System.out.println("发送信息：" + message);
        //编译不通过，因为超出了phoneNum
//        System.out.println("手机能够拨打" + phoneNumber + "这个电话");
        //编译通过。
        System.out.println(name);
    }

    public void playGame() {
        System.out.println("手机可以玩游戏");
    }
}
