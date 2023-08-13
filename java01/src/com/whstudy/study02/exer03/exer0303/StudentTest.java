package com.whstudy.study02.exer03.exer0303;

/**
 * ClassName: StudentTest
 * Package: com.whstudy.study02.exer03
 * Description:
 * <p>
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
        StudentUtil util = new StudentUtil();
        util.AssignmentStudents(students);
        util.FindState(students, 3);
        System.out.println("交换前：");
        util.print(students);
        System.out.println("交换后：");
        util.sortStudents(students, "升序");
        util.print(students);
        System.out.println("交换后：");
        util.sortStudents(students, "降序");
        util.print(students);
    }
}
