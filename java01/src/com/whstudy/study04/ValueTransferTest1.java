package com.whstudy.study04;

/**
 * ClassName: ValueTransferTest1
 * Package: com.whstudy.study04
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/26 15:04
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();
        //1.对于基本数据类型的变量来说
        int m = 10;
        test.method1(m);
        System.out.println("m = " + m);
        //2.对于引用数据类型的变量来说
        Person01 p = new Person01();
        p.age = 10;
        test.method2(p);
        System.out.println(p.age);
    }
    public void method1(int m){
        m++;
    }
    public void method2(Person01 p){
        p.age++;
    }
}
class Person{
    int age;
}
