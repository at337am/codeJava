package com.linyz.a03Lambda;

public class demo1 {
    public static void main(String[] args) {

        // Swim接口 匿名内部类的写法
        method(new Swim() {
            @Override
            public void swiming() {
                System.out.println("正在游泳");
            }
        });

        // lambda表达式
        /*只适用于函数式接口
        * 函数式接口: 只有一个抽象方法的接口, 并且要写在接口上注解@FunctionalInterface*/

        // 因为method的参数是Swim s(实现了接口 的对象)所以lambda就知道了是Swim这个接口
        method(() -> {
            System.out.println("游起来");
        });

        // 因为toRun方法的参数是Run r,所以lambda才知道是Run这个接口
        toRun(() -> {
            System.out.println("跑起来");
        });

    }

    public static void method(Swim s){
        s.swiming();
    }

    public static void toRun(Run r) {
        r.run();
    }
}


// 写一个接口, 注解: 函数式接口
@FunctionalInterface
interface Swim{
    public abstract void swiming();
}

@FunctionalInterface
interface Run {
    public abstract void run();
}
