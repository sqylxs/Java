package com.whstudy.study02.exer04;

/**
 * ClassName: StringConCatTest
 * Package: com.whstudy.study02.exer04
 * Description:
 *
 * 练习——可变个数形参的方法
 *
 * @Author whstudy
 * @Create 2023/7/26 11:48
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info =test.SCC("-", "hello", "world");
        System.out.println(info);
        System.out.println(test.SCC("-", "hello"));
        System.out.println(test.SCC("-"));
    }
    //n个字符进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
    public String SCC(String operator,String ... strs){
        String info = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                info += strs[i];
            } else {
                info += (operator + strs[i]);
            }
        }
        return info;
    }
}
