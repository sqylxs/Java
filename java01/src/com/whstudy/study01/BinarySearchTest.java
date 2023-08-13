package com.whstudy.study01;

/**
 * ClassName: BinarySearchTest
 * Package: com.whstudy.study01
 * Description:
 * <p>
 * 二分法查找
 *
 * @Author whstudy
 * @Create 2023/7/20 18:38
 * @Version 1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};

        int target = 5;
        int head = 0;//默认的首索引
        int end = arr.length - 1;//默认的尾索引

        boolean isFlag = true;
        while (head <= end) {

            int middle = (head + end) / 2;
            if (target == arr[middle]) {
                System.out.println("恭喜你，找到了" + target + "。位置是：" + middle + "。");
                isFlag = false;
                break;
            } else if (target > arr[middle]) {
                head = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (isFlag) {
            System.out.println("对不起，没有找到！");
        }
    }
}
