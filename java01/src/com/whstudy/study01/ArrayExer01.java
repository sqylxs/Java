package com.whstudy.study01;

import java.util.Scanner;

/**
 * ClassName: ArrayExer01
 * Package: com.whstudy.study01
 * Description:练习
 *
 * 从用户那里获取数字，对应输出星期的英文。
 *
 * @Author whstudy
 * @Create 2023/7/19 18:54
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        String[] weeks = {"Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        labar:while (true){
            System.out.print("请输入1-7，0是退出：");
            int day = scan.nextInt();
            switch (day){
                case 1:
                    System.out.println(weeks[0]);
                    break;
                case 2:
                    System.out.println(weeks[1]);
                    break;
                case 3:
                    System.out.println(weeks[2]);
                    break;
                case 4:
                    System.out.println(weeks[3]);
                    break;
                case 5:
                    System.out.println(weeks[4]);
                    break;
                case 6:
                    System.out.println(weeks[5]);
                    break;
                case 7:
                    System.out.println(weeks[6]);
                    break;
                case 0:
                    break labar;
            }
        }
        scan.close();
    }
}
