package com.linyz.a03interfacedemo2;

/*如果类使用了最后一层继承的接口,
* 那么要把前面的所有接口的抽象方法都重写*/
public class InterImplements implements Inter3{
    @Override
    public void mathod1(){
        System.out.println("mathod1");
    }

    @Override
    public void mathod2(){
        System.out.println("mathod2");
    }

    @Override
    public void mathod3(){
        System.out.println("mathod3");
    }
}
