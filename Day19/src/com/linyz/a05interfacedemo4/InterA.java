package com.linyz.a05interfacedemo4;

public interface InterA {

    /*抽象方法*/
    public abstract void mathod();


    /*默认方法*/
    public default void show() {
        System.out.println("默认方法A");
    }


}
