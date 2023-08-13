package com.whstudy.study06;

/**
 * ClassName: StudentList
 * Package: com.whstudy.study06
 * Description:
 * 学生管理模块
 *
 * @Author whstudy
 * @Create 2023/7/30 10:19
 * @Version 1.0
 */
public class StudentList {
    private Student[] students;//构造一个用来保存学生对象的数组
    private int total;//记录已经保存的学生对象的数量

    /**
     * 用途：构造器，用来初始化students数组
     *
     * @param totalStudent 指定students数组的最大空间
     */
    public StudentList(int totalStudent) {
        students = new Student[totalStudent];
    }

    /**
     * 用途：添加学生对象并记录
     *
     * @param student 指定要添加的学生对象
     * @return 添加成功返回true；失败则返回false且此时数组已满
     */
    public boolean addStudent(Student student) {
        if (total < students.length) {
            students[total++] = student;
            return true;
        }
        return false;
    }

    /**
     * 用途：替换指定的学生对象
     *
     * @param index 指定所替换学生对象所在数组中的位置，从0开始
     * @param stu   指定替换的学生对象那个
     * @return 成功则返回true 失败则返回false且此时代表索引无效
     */
    public boolean replaceStudent(int index, Student stu) {
        if (index >= 0 && index < total) {
            students[index] = stu;
            return true;
        }
        return false;
    }

    /**
     * 删除指定的学生对象
     *
     * @param index 指定删除学生对象在数组中的索引位置，从0开始
     * @return 删除成功返回true 失败则返回false且此时代表索引无效
     */
    public boolean deleteStudent(int index) {
        if (index < 0 || index > total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--total] = null;
        return true;
    }
    /**
     * 用途：返回数组中记录的所有学生对象
     *
     * @return Student[] 数组中包含了当前所有学生对象，该数组长度与对象个数相等
     */
    public Student[] getAllStudents() {
        Student[] stus = new Student[total];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = students[i];
        }
        return stus;
    }

    /**
     * 用途： 返回参数index指定索引位置的学生对象
     *
     * @param index 指定所有获取的学生在数组中的索引位置，从0开始
     * @return 封装了客户信息的Student 对象
     */
    public Student getStudent(int index) {
        if (index < 0 || index >= total) {
            return null;
        } else {
            return students[index];
        }
    }

    /**
     * 获取学生列表中学生的数量
     *
     * @return total
     */
    public int getTotal() {
        return total;
    }
}
