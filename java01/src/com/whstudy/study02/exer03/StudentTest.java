package com.whstudy.study02.exer03;

/**
 * ClassName: StudentTest
 * Package: com.whstudy.study02.exer03
 * Description:
 *
 * 2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @Author whstudy
 * @Create 2023/7/25 17:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random()*6 + 1);
            students[i].score = (int)(Math.random()*101);
            Student stu = students[i];
            if(students[i].state == 3){
                System.out.println(stu.Show());
            }
        }
        System.out.println("交换前：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Show());
        }

        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                if (students[j].score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        System.out.println("交换后：");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Show());
        }


    }
}
