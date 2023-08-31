package com.linyz.a04interfacedemo3;

/*运动员
* 抽象类*/

public abstract class Athlete extends Person {
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void start();
}
