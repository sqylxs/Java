package com.whstudy.study04;

/**
 * ClassName: Person
 * Package: com.whstudy.study04
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/28 15:22
 * @Version 1.0
 */
public class Person01 {
    //属性
    int age;
    String name;
    //构造器
    public Person01(){
        System.out.println("Person....");
    }

    //声明其他的构造器
    public Person01(int a){
        age = a;
    }
    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hours){
        System.out.println("每天至少睡" + hours + "小时");
    }
}
