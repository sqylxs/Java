package com.whstudy.study01;

/**
 * ClassName: ArrayExer02
 * Package: com.whstudy.study01
 * Description:
 *
 * 数组的缩容与扩容
 *
 * @Author whstudy
 * @Create 2023/7/20 17:47
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        //数组的扩容，将10，20，30加入arr数组中
        int[] newArr = new int[arr.length << 1];
        for (int i = 0; i < arr.length;i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length+1] = 20;
        newArr[arr.length+2] = 30;

        arr = newArr;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //数组的缩容，去掉索引为4的位置
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int[] newArr1 = new int[arr1.length-1];
        for (int i = 0; i < newArr1.length; i++) {
            if(i >= 4){
                newArr1[i] = arr1[i+1];
            } else{
                newArr1[i] = arr1[i];
            }
        }
        arr1 = newArr1;
        //遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
