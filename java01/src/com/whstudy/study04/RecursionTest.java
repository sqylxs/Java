package com.whstudy.study04;

/**
 * ClassName: RecursionTest
 * Package: com.whstudy.study04
 * Description:
 *
 * 递归的测试
 *
 * @Author whstudy
 * @Create 2023/7/27 10:54
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        System.out.println(test.getSum(100));
        System.out.println(test.getFactorial(5));
        System.out.println(test.f(10));
    }
    /*
    * 如下递归方法的调用会导致StackOverflowError（堆栈溢出错误）
    * */
//    public void method1(){
//        System.out.println("method1()....");
//        method1();
//    }
    //例子1：计算1-100自然数的和
    public int getSum(int num){
        if (num == 1){
            return 1;
        }else {
            return getSum(num-1) + num;
        }
    }
    //例子2：计算n！
    public int getFactorial(int num){
        if (num == 1){
            return 1;
        }else {
            return getFactorial(num-1) * num;
        }
    }
    //例子3：快速排序

    //例子4：汉诺塔游戏

    //例子5：斐波那契数列
    //1 1 2 3 5 8 13 21 34 55...
    //f(n) = f(n-1) + f(n-2)
    public int f(int n){
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return  1;
        }else{
            return f(n-1) + f(n-2);
        }
    }
    //例子6：
    //file类的对象表示一个文件目录。
    //计算指定的文件目录的大小，遍历指定的文件目录中的所有的文件，删除指定的文件目录。
}
