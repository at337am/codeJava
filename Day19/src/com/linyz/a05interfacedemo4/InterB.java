package com.linyz.a05interfacedemo4;

public interface InterB {

    /*和接口InterA同名的默认方法show()*/
    public default void show() {
        System.out.println("默认方法B");
    }
}
