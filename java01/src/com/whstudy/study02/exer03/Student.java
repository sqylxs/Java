package com.whstudy.study02.exer03;

/**
 * ClassName: student
 * Package: com.whstudy.study02.exer03
 * Description:
 *
 * 1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 *
 * @Author whstudy
 * @Create 2023/7/25 17:10
 * @Version 1.0
 */
public class Student {
    //属性
    int number;//学号
    int state;//年级
    int score;//成绩
    public String Show(){
        return "学号："+ number + "。年级："+ state
                + "。成绩："+ score + "。";
    }
}
