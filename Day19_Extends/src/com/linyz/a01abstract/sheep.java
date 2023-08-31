package com.linyz.a01abstract;
/*绵羊类*/
public class sheep extends Animal{

    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("绵羊在喝水");
    }
}
