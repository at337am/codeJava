package com.linyz.a03innerClass.a02;

public class y1 {
    public static void main(String[] args) {

        Outer o = new Outer();
        //Outer.Inner报错,因为Inner内部类是私有的,其它类不知道有Inner这个类
        /*Outer.Inner inner = new Outer().new Inner();*/
        /*Outer.Inner inner = o.getInstance();*/

        /*可以用内部类的父类去接受,虽然Inner没有父类,但是有隐藏的Object类*/
        Object inner = o.getInstance();
    }
}
