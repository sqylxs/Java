package com.whstudy.study02.exer01;

/**
 * ClassName: PersonTest
 * Package: com.whstudy.study02.exer01
 * Description:
 *
 案例：

 (1)创建Person类的对象，设置该对象的name、age和gender属性，
 调用study方法，输出字符串“studying”;
 调用showAge()方法，返回age值;
 调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。

 (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 *
 * @Author whstudy
 * @Create 2023/7/25 11:31
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        //调用属性
        p1.name = "Tom";
        p1.age = 24;
        p1.gender = '男';
        //调用方法
        p1.study();
        p1.addAge(2); //此时年龄已经加了2岁
        int age = p1.shouAge();//age重新定义了变量
//        p1.addAge(2);
        //如果此时有语句p1.addAge(2);但是打印age时并不会加上2，如果打印p1.shouAge会显示加上了2
        System.out.println("age = " + age);
        Person p2 = new Person();
        p2.addAge(10);
        System.out.println(p2.shouAge());
        System.out.println(p1.shouAge());
    }
}
