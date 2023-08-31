package com.linyz.a04interfacedemo3;

/*教练
* 抽象类*/

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
