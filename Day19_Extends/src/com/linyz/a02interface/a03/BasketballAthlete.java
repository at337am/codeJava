package com.linyz.a02interface.a03;
/*篮球运动员*/
public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void start(){
        System.out.println("篮球运动员在学习打篮球");
    }
}
