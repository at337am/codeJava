package com.linyz.a06interfacedemo5;

/*实现类*/

public class InterImpl implements Inter{

    @Override
    public void mathod(){
        System.out.println("这是实现类InterImpl重写的抽象方法");
    }

    /*这个不叫重写方法,只是刚好有个和接口中同名的方法*/
    public static void show(){
        System.out.println("这是实现类InterImpl中的静态方法show()");
    }

}
