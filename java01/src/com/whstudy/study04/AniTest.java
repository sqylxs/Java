package com.whstudy.study04;

/**
 * ClassName: AniTest
 * Package: com.whstudy.study04
 * Description:
 *
 * @Author whstudy
 * @Create 2023/7/27 20:35
 * @Version 1.0
 */
public class AniTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "金蟾";
        //因为legs声明为private，是私有的，出了Anima类之外就不能调用了
//        animal.legs = 4;
        //只能通过setLegs()，间接的对legs属性进行赋值
        animal.setLegs(7);
//        System.out.println("name = " + animal.name + ", legs = " + animal.legs);
        System.out.println("name = " + animal.name + ", legs = " + animal.getLegs());
        animal.eat();
    }
}


class Animal { //动物
    //属性
    String name;//名字
    private int legs;//腿的个数

    //方法
    //设置legs的属性值
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            System.out.println("你输入的数据非法");
        }
    }

    //获取legs的属性值
    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("动物觅食");
    }
}