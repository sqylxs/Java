package com.whstudy.study04;

/**
 * ClassName: ValueTransferTest3
 * Package: com.whstudy.study04
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/26 17:20
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m + ",n = " + data.n);
        //交换两个变量的值
//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;
        test.swap(data);
        System.out.println("m = " + data.m + ",n = " + data.n);

    }
    public void swap(Data data) { // Data 是引用数据类型，现在里面定义了两个属性
        int temp = data.m;       // m 和 n 而 data 现在是变量名，Data data共同组成形参
        data.m = data.n;
        data.n = temp;

    }
}

class Data {
    int m;
    int n;
}

