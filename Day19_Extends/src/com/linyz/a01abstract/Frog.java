package com.linyz.a01abstract;
/*狐狸类*/
public class Frog extends Animal{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在喝水");
    }
}
