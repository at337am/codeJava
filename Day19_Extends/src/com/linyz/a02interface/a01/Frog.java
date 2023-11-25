package com.linyz.a02interface.a01;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    /*重写父类中的eat方法和接口中的swim方法*/

    @Override
    public void eat(){
        System.out.println("青蛙在吃花");
    }

    @Override
    public void swim(){
        System.out.println("青蛙在游泳");
    }


}