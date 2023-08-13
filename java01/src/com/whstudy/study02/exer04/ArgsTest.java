package com.whstudy.study02.exer04;

/**
 * ClassName: ArgsTest
 * Package: com.whstudy.study02.exer04
 * Description:
 *
 * 可变个数的形参的方法
 *
 * @Author whstudy
 * @Create 2023/7/26 11:21
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest nums = new ArgsTest();
//        nums.print(1,34,5,7,9,0);
        nums.print(new int[]{1, 23, 6, 4, 5, 6, 8});
    }
//    public void print(int ... nums){
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
    public void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
