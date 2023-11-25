package com.linyz.a03innerClass.a05;

public class y1 {

    public static void main(String[] args) {

        /*匿名内部类既存在类的特性（有类的内容定义）
        * 也是一个对象（是类的一个实例）。
        *
        *
        * !!!不能直接创建抽象类和接口的对象
        *
        * 下面这段代码的逻辑是:
        * 先创建了一个Swim接口的子类, 子类中重写了swim抽象方法. ---这个就是匿名内部类
        * 然后实现了匿名内部类的对象, 并赋值给Swim父类类型的变量. ---这个是多态的思想*/

        Swim s = new Swim(){
            @Override
            public void swim(){
                System.out.println("重写了接口Swim的方法");
            }
        };
        s.swim();// 最调用类里面的方法


        // 实际应用场景
        method(new Swim() {
            @Override
            public void swim() {
                System.out.println("我会游泳了");
            }
        });

    }

    // 定义了一个形参是Swim接口类型的方法
    public static void method(Swim s) {
        s.swim();
    }
}
