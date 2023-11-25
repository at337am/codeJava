package com.linyz.a02interface.a04;

public interface InterA {

    /*抽象方法*/
    void mathod();


    /*默认方法*/
    default void show() {
        System.out.println("默认方法A");
    }


}
