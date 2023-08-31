package com.linyz.a02interfacedemo1;

public class y1 {
    public static void main(String[] args) {
        Frog f = new Frog("蚊香蝌蚪",2);
        System.out.println("name: " + f.getName() + "age: " + f.getAge());
        f.eat();
        f.swim();

        Rabbit r = new Rabbit("闪耀王牌",36);
        System.out.println("name: " + r.getName() + "age: " + r.getAge());
        r.eat();
        /*r.swim(); 兔子不能调用swim方法*/
    }
}
