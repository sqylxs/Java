package com.whstudy.study02.exer03.exer0303;

/**
 * ClassName: StudentUtil
 * Package: com.whstudy.study02.exer0303
 * Description:
 *
 *
 * 方法
 *
 * @Author whstudy
 * @Create 2023/7/25 17:56
 * @Version 1.0
 */
public class StudentUtil {
    public void FindState(Student[] students,int index){
        for (int i = 0; i < 20; i++) {
            Student stu = students[i];
            if(students[i].state == index){
                System.out.println(stu.Show());
            }
        }
    }
    public void print(Student[] students){
        for (int i = 0; i < 20; i++) {
            System.out.println(students[i].Show());
        }
    }
    public void sortStudents(Student[] students,String judgement){
        if ("升序".equals(judgement)){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                if (students[j].score > students[j+1].score){
//                    Student temp = students[j];
//                    students[j] = students[j+1];
//                    students[j+1] = temp;
                    swap(students,i,j);
                }
            }
        }
    } else if ("降序".equals(judgement)){
            for (int i = 0; i < students.length-1; i++) {
                for (int j = 0; j < students.length-1-i; j++) {
                    if (students[j].score < students[j+1].score){
//                        Student temp = students[j];
//                        students[j] = students[j+1];
//                        students[j+1] = temp;
                        swap(students,i,j);
                    }
                }
            }
        }else {
            System.out.println("你的输入有误！");
        }
        }
        public void swap(Student[] students,int i,int j){
            Student temp = students[j];
            students[j] = students[j+1];
            students[j+1] = temp;
        }
        public void AssignmentStudents(Student[] students){
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random()*6 + 1);
            students[i].score = (int)(Math.random()*101);
        }
    }
}
