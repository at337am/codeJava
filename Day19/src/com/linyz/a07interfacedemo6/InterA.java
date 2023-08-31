package com.linyz.a07interfacedemo6;

/*私有方法:
    * 分为静态私有和普通私有
    * 抽取静态方法中的共性到静态私有中.
    * 抽取普通方法中的共性到普通方私有中*/
public interface InterA {

    public default void show1(){
        System.out.println("InterA: 默认方法show1()");
        AAA();
    }

    public default void show2(){
        System.out.println("InterA: 默认方法show2()");
        AAA();
    }

    public static void show3(){
        System.out.println("InterA: 静态方法show3()");
        BBB();
    }

    public static void show4(){
        System.out.println("InterA: 静态方法show4()");
        BBB();
    }


    /*私有方法,给默认方法服务的*/
    private void AAA(){
        System.out.println("测试语句AAA");
    }

    /*静态的私有方法,给静态方法服务的*/
    private static void BBB(){
        System.out.println("测试语句BBB");
    }
}
