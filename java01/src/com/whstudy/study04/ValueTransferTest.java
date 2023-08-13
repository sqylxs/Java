package com.whstudy.study04;

/**
 * ClassName: ValueTransferTest
 * Package: com.whstudy.study04
 * Description:
 * <p>
 * 方法的参数传递机制 复习
 *
 * @Author whstudy
 * @Create 2023/7/26 14:51
 * @Version 1.0
 */
class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m; //传递的是数据值
        System.out.println("m = " + m + ",n = " + n);
        m++;
        System.out.println("m = " + m + ",n = " + n);

        //2.引用数据类型的局部变量
        //2.1数组类型
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = arr1; //传递的是地址值
        arr2[0] = 10;
        System.out.println(arr1[0]);//10

        //2.2对象类型
        OrderId order1 = new OrderId();
        order1.orderId = 1001;
        OrderId order2 = order1; //传递的是地址值
        order2.orderId = 1002;
        System.out.println(order2.orderId);//1002

    }
}

class OrderId {
    int orderId;
}
