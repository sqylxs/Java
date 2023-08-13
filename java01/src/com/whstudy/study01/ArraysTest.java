package com.whstudy.study01;

import java.util.Arrays;

/**
 * ClassName: ArraysTest
 * Package: com.whstudy.study01
 * Description:
 *
 * Arrays工具类的使用
 *
 * @Author whstudy
 * @Create 2023/7/24 10:37
 * @Version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b):比较两个数组的元素是否依次相等。
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println(arr1 == arr2); //存什么比什么  false
        boolean isEquals = Arrays.equals(arr1,arr2); //ture
        System.out.println(isEquals);
        //2.String toString(int[] a):输出数组元素信息。
        System.out.println(arr1);//[I@776ec8df
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5]
        //3.void fill(int [] a,int val):将指定值填充到数组之中。
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4.void sort(int[] a):使用快捷排序算法实现的排序。
        int[] arr3 = new int[]{3,45,2,45,1,4,5,67,8,76,234,87,123};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        //5.int binarySearch(int[] a,int key):二分查找
        //使用前提，当前数组必须是有序的
        int index = Arrays.binarySearch(arr3,5);
        System.out.println(index);//负数代表没有找到，可以加一个if判断
    }
}
