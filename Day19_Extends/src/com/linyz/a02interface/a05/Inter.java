package com.linyz.a02interface.a05;

/*接口中的静态方法
* 特点:
*   不能被重写
*   调用要用接口名.方法名*/

public interface Inter {
    void mathod();


    /*静态方法,不能被重写,调用方式为Inter.show();*/
    static void show(){
        System.out.println("这是接口Inter中的静态方法show()");
    }
}
