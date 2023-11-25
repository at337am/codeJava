package com.linyz.a03innerClass.a03;
/*测试类*/
public class y1 {
    public static void main(String[] args) {
        /*创建成员内部类对象的格式
        先new的是Outer的对象,
        然后再用这个对象调用内部类构造函数来创建的Inner对象*/
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
