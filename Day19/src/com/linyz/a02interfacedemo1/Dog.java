package com.linyz.a02interfacedemo1;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    /*重写父类中的eat方法和接口中的swim方法*/

    @Override
    public void eat(){
        System.out.println("狗在啃骨头");
    }

    @Override
    public void swim(){
        System.out.println("狗在游泳");
    }
}
