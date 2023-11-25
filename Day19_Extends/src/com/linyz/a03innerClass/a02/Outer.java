package com.linyz.a03innerClass.a02;

/*成员内部类
* 调用成员内部类时需要创建对象*/

public class Outer {

    /*定义一个私有的内部类*/
    private class Inner{

    }

    /*调用内部类的方法*/
    public Inner getInstance(){
        return new Inner();
    }


}
