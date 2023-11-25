package com.linyz.a03innerClass.a04;

public class y1 {
    public static void main(String[] args) {
        /*创建静态内部类对象的格式:*/
        /*new的是Outer里面的Inner的对象*/
        Outer.Inner oi = new Outer.Inner();


        /*访问静态内部类中非静态方法*/
        oi.show1();
        /*也可直接用:
        new Outer.Inner().show1();*/

        /*访问静态内部类中静态方法*/
        Outer.Inner.show2();


        /*和调用普通类中的静态非静态方法一样*/
    }
}
