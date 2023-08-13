package com.whstudy.study01;

/**
 * ClassName: TwoArrayTest
 * Package: com.whstudy.study01
 * Description:
 * <p>
 * 二维数组的讲解
 *
 * @Author whstudy
 * @Create 2023/7/19 19:45
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        //1.数组的声明与初始化
        //方式1：静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //方式2：动态初始化1:
        String[][] arr2 = new String[3][4];
        //方式2：动态初始化2:
        double[][] arr3 = new double[3][];

        //2.数组元素的的调用
        //针对于arr1来说，外层元素是{1, 2, 3}, {4, 5, 6}, {7, 8, 9}，内层元素：1，2，3，4，5，6，7，8，9、
        //调用内存元素
        System.out.println(arr1[0][0]);//1
        System.out.println(arr1[2][0]);//7

        //调用外层元素
        System.out.println(arr1[0]);//[I@776ec8df 指向地址

        //测试arr2和arr3
        arr2[0][1] = "Tom";
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0]);//[Ljava.lang.String;@4eec7777

        arr3[0] = new double[4];
        arr3[0][0] = 1.0;
        System.out.println(arr3[0][0]);

        //3.数组的长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[0].length);//3

        //4.如何遍历数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //5.数组元素的默认初始化

        int[][] arr4 = new int[3][2];
        //以动态初始化方式1说明：
        //外层元素默认值
        System.out.println(arr4[0]);//[I@568db2f2
        System.out.println(arr4[1]);//[I@378bf509
        //内层元素默认值
        System.out.println(arr4[0][0]);//0

        boolean[][] arr5 = new boolean[3][2];
        //外层元素默认值
        System.out.println(arr5[0]);//[Z@5fd0d5ae
        //内层元素默认值
        System.out.println(arr5[0][0]);//false

        //String[][] arr2 = new String[3][4];
        //外层元素默认值
        System.out.println(arr2[0]);//[Ljava.lang.String;@4eec7777
        //内层元素默认值
        System.out.println(arr2[0][0]);//null
        //*********************************************************
        //以动态初始化方式2说明
        int[][] arr6 = new int[3][];
        //外层元素默认值
        System.out.println(arr6[0]);//null
        //内层元素默认值
        System.out.println(arr6[0][0]);//报错

        //6.数组的内存解析
        //同一维数组

    }
}
