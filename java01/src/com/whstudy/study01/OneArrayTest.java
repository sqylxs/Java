package com.whstudy.study01;

/**
 * ClassName: OneArrayTest
 * Package: com.whstudy.study01
 * Description:
 *
 * 一维数组的讲解
 *
 * @Author whstudy
 * @Create 2023/7/19 8:33
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        //1.1声明数组
        double[] prices;
        //1.2数组的初始化
        //静态初始化：数组变量的初始化与数组元素的赋值操作同时进行。
        prices = new double[]{20.32,43.21,43.22,54.21};
//        String[] foods;
//        foods = new String[]{"拌海蜇", "龙须菜", "炝冬笋", "玉兰片"};
        //数组的生命与初始化
        //动态初始化：数组变量的初始化与数组元素的赋值操作分开进行。
        String[] foods= new String[4];
        //其他正确的方式
//        int[] arr = new int[4];
//        int[] arr1 = {1,2,3,4};

        //2.数组元素的调用
        //通过角标的方式，获取数组的元素
        System.out.println(prices[0]);
        System.out.println(prices[1]);

        foods[0] = "拌海蜇";
        foods[1] = "龙须菜";
        foods[2] = "炝冬笋";
        foods[3] = "玉兰片";

        //3.数组的长度：用来描述数组容器中容量的大小
        //使用length属性表示
        System.out.println(foods.length);
        System.out.println(prices.length);

        //4.如何遍历数组
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0;i < 4 ;i++){
//            foods [i] = scan.next();
//        }
        for (int i = 0;i < 4;i++){
            System.out.println(foods[i]);
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        //5.数组元素的默认初始化值

        int[] arr1 = new int[3];
        System.out.println(arr1[0]);

        boolean[] arr2 = new boolean[5];
        System.out.println(arr2[0]);

        String[] arr4 = new String[4];
        System.out.println(arr4[0]);

        //6.数组的内存解析
        int[] a1 = new int[]{1,2,3};
        int[] a2 = a1;
        a2[1] = 10;
        System.out.println(a1[1]);
        System.out.println(a1);
        System.out.println(a2);
    }
}
