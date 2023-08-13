package com.whstudy.study02.exer02;

/**
 * ClassName: Exer02Test
 * Package: com.whstudy.study02.exer02
 * Description:
 * <p>
 * <p>
 * 案例：
 * <p>
 * 1. 编写程序，声明一个method1方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 * <p>
 * 2. 编写程序，声明一个method2方法，除打印一个10*8的*型矩形外，
 * 再计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 * <p>
 * 3. 编写程序，声明一个method3方法，在method3方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * @Author whstudy
 * @Create 2023/7/25 11:58
 * @Version 1.0
 */
public class Exer02Test {
    public static void main(String[] args) {
        //创建Exer02的对象，由于级别不同的原因
        Exer02 exer = new Exer02();
        exer.method1();
        int s1 = exer.method2();
        System.out.println("矩形面积是：" + s1);
        int s2 = exer.method3(3, 4);
        System.out.println("矩形面积是：" + s2);
    }
}
