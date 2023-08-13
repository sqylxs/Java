package com.whstudy.study01;

/**
 * ClassName: LinearSearchTest
 * Package: com.whstudy.study01
 * Description:
 *
 * 线性查找
 *
 * @Author whstudy
 * @Create 2023/7/20 18:04
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        //查找元素5
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int target = 5;

//        target = 99;
        //查找方式：线性查找
        int i = 0;
        for (; i < arr.length; i++) {
            if(target == arr[i]){
                System.out.println("恭喜你，找到了" + target + ".所在的位置是：" + i + ".");
                break;
            }
        }
        if(i == arr.length){
            System.out.println("不好意思，没有找到此元素.");
        }
    }
}
