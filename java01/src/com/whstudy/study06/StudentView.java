package com.whstudy.study06;


import com.whstudy.study03.project.model.CMUtility;

/**
 * ClassName: StudentView
 * Package: com.whstudy.study06
 * Description:
 * 主模块，负责菜单的显示和处理用户操作
 *
 * @Author whstudy
 * @Create 2023/7/30 10:55
 * @Version 1.0
 */
public class StudentView {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        view.enterMainMenu();
    }

    StudentList studentList = new StudentList(20);

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-----------------------学生管理系统---------------------\n");
            System.out.println("                   1 添 加 学 生 信 息");
            System.out.println("                   2 修 改 学 生 信 息");
            System.out.println("                   3 删 除 学 生 信 息");
            System.out.println("                   4 查 询 学 生 信 息");
            System.out.println("                   5 打 印 学 生 列 表");
            System.out.println("                   6 退            出\n");
            System.out.print("                   请选择(1-5)：");
            char key = STUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewStudent();
                    break;
                case '2':
                    modifyStudent();
                    break;
                case '3':
                    deleteStudent();
                    break;
                case '4':
                    FindStudent();
                    break;
                case '5':
                    listAllStudents();
                    break;
                case '6':
                    System.out.print("请确认您是否退出(Y/N)：");
                    char isEXit = STUtility.readConfirmSelection();
                    if (isEXit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    private void addNewStudent() {
        System.out.println("---------------------添加学生信息---------------------");
        System.out.print("学号：");
        String studentNumber = STUtility.readString(15);
        System.out.print("姓名：");
        String name = STUtility.readString(4);
        System.out.print("性别：");
        char gender = STUtility.readChar();
        System.out.print("年龄：");
        int age = STUtility.readInt();
        System.out.print("电话：");
        String phone = STUtility.readString(15);
        System.out.print("邮箱：");
        String email = STUtility.readString(25);
        Student stu = new Student(studentNumber, name, gender, age, phone, email);
        boolean flag = studentList.addStudent(stu);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    private void modifyStudent() {
        System.out.println("---------------------修改学生信息---------------------");

        int index = 0;
        Student stu = null;
        while (true) {
            System.out.print("请选择待修改学生信息编号(-1退出)：");
            index = STUtility.readInt();
            if (index == -1) {
                return;
            }
            stu = studentList.getStudent(index - 1);
            if (stu == null) {
                System.out.println("无法找到指定学生信息！");
            } else break;
        }
        System.out.print("学号(" + stu.getStudentNumber() + "):");
        String studentNumber = STUtility.readString(15);
        System.out.print("姓名(" + stu.getName() + ")：");
        String name = STUtility.readString(4, stu.getName());
        System.out.print("性别(" + stu.getGender() + ")：");
        char gender = CMUtility.readChar(stu.getGender());
        System.out.print("年龄(" + stu.getAge() + ")：");
        int age = CMUtility.readInt(stu.getAge());
        System.out.print("电话(" + stu.getPhone() + ")：");
        String phone = CMUtility.readString(15, stu.getPhone());
        System.out.print("邮箱(" + stu.getEmail() + ")：");
        String email = CMUtility.readString(25, stu.getEmail());

        stu = new Student(studentNumber, name, gender, age, phone, email);
        boolean flag = studentList.replaceStudent(index - 1, stu);
        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定学生信息,修改失败--------------");
        }
    }

    private void deleteStudent() {
        System.out.println("---------------------删除学生信息---------------------");

        int index = 0;
        Student stu = null;
        while (true) {
            System.out.print("请选择待删除学生信息编号(-1退出)：");
            index = STUtility.readInt();
            if (index == -1) {
                return;
            }
            stu = studentList.getStudent(index - 1);
            if (stu == null) {
                System.out.println("无法找到指定客户！");
            } else
                break;
        }

        System.out.print("确认是否删除(Y/N)：");
        char yn = STUtility.readConfirmSelection();
        if (yn == 'N')
            return;
        boolean flag = studentList.deleteStudent(index - 1);
        if (flag) {
            System.out
                    .println("---------------------删除完成---------------------");
        } else {
            System.out.println("----------无法找到指定学生信息,删除失败--------------");
        }
    }
    private void FindStudent(){
        System.out.println("请输入想要查询学生的学号");
        STUtility.readString(20);
    }

    private void listAllStudents() {
        System.out.println("----------------------------------------学生信息列表----------------------------------------");
        Student[] stus = studentList.getAllStudents();
        if (stus.length == 0) {
            System.out.println("没有学生信息记录！");
        } else {
            System.out.println("编号\t\t学号\t\t\t\t姓名\t\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
            for (int i = 0; i < stus.length; i++) {
                System.out.println(" " + (i + 1) + "\t\t" + stus[i].getFull());
            }
        }
        System.out.println("--------------------------------------学生信息列表完成---------------------------------------");
    }
}
