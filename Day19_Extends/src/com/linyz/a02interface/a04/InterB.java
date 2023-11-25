package com.linyz.a02interface.a04;

public interface InterB {

    /*和接口InterA同名的默认方法show()*/
    default void show() {
        System.out.println("默认方法B");
    }
}
