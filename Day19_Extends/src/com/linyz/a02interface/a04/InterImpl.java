package com.linyz.a02interface.a04;

public class InterImpl implements InterA,InterB{
    @Override
    public void mathod(){
        System.out.println("重写了抽象方法");
    }


    /*InterImpl类实现了多个接口,并且两个接口中有重名的默认方法,
    所以要重写默认方法*/
    @Override
    public void show() {
        System.out.println("重写接口中的默认方法show()");
    }
}
