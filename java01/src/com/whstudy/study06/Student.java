package com.whstudy.study06;

/**
 * ClassName: Student
 * Package: com.whstudy.study06
 * Description:
 * 学生类
 *
 * @Author whstudy
 * @Create 2023/7/30 10:10
 * @Version 1.0
 */
public class Student {
    private String studentNumber;//学号
    private String name;//姓名
    private char gender;//性别
    private int age;//年龄
    private String phone;//电话
    private String email;//邮箱
    public Student() {
    }

    public Student(String studentNumber, String name, char gender, int age, String phone, String email) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFull(){
        return studentNumber+"\t"+name + "\t\t" + gender + "\t\t" + age + "\t\t" + phone +"\t\t" + email;
    }
}
