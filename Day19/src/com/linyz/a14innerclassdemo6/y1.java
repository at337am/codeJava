package com.linyz.a14innerclassdemo6;

public class y1 {

    public static void main(String[] args) {

        /*匿名内部类既存在类的特性（有类的内容定义）
        * 也是一个对象（是类的一个实例）。*/

        // 用变量s接收
        Swim s = new Swim(){
            @Override
            public void swim(){
                System.out.println("重写了接口Swim的方法");
            }
        };
        s.swim();// 调用类里面的方法

        Person p = new Person(){
            @Override
            public void eat(){
                System.out.println("重写了抽象类Person的方法");
            }
        };
        p.eat();


        // 应用场景
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("吃了一块蛋糕");
            }
        });
    }

    public static void method(Person p){
        p.eat();
    }


}
